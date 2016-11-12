using Common.DTOs;
using DataAccessLayer.Entities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Validators;

namespace Business.Connectors
{
    public class UserConnector : BaseConnector<UserDTO, User>
    {
        public UserConnector(IUserRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        public override ValidationResult Validate(UserDTO dto)
        {
            throw new NotImplementedException();
        }
    }
}
