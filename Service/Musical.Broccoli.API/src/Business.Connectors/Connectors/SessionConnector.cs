using System;
using System.Linq;
using AutoMapper;
using Business.Connectors.Contracts;
using Common.DTOs;
using Common.Exceptions;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;

namespace Business.Connectors
{
    public class SessionConnector : ISessionConnector
    {
        private readonly ISessionRepository _sessionRepository;
        private readonly IUserRepository _userRepository;
        private readonly IMapper _mapper;

        public SessionConnector(ISessionRepository sessionRepository, IUserRepository userRepository, IMapper mapper)
        {
            _sessionRepository = sessionRepository;
            _userRepository = userRepository;
            _mapper = mapper;
        }


        public SessionDTO Create(UserDTO userDto)
        {
            var userExists = _userRepository.GetQueryable()
                .Any(x => x.Email == userDto.Email && x.Password == userDto.Password);

            if (!userExists) throw new AuthenticationException();

            var session = new Session
            {
                AuthorizationToken = Guid.NewGuid(),
                UserID = userDto.Id,
                DateCreated = DateTime.Now
            };

            _sessionRepository.AddOrUpdate(session);
            _sessionRepository.SaveChanges();

            return _mapper.Map<SessionDTO>(session);
        }


        public UserDTO Authenticate(string authToken)
        {
            var authTokenGuid = Guid.Parse(authToken);

            var session = _sessionRepository.GetFullSession(authTokenGuid);

            return _mapper.Map<SessionDTO>(session).User;
        }
    }
}