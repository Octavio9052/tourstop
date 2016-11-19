using  Common.DTOs;
using DataAccessLayer.Entities;
using System;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Contracts;
using Business.Controllers.Petition;

namespace Business.Connectors
{
    public class UserConnector : BaseConnector<UserDTO, User>, IUserConnector
    {
        public UserConnector(IUserRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        protected override bool ValidatePetition( BusinessPetition<UserDTO> petition )
        {
            throw new NotImplementedException();
        }
    }
}
