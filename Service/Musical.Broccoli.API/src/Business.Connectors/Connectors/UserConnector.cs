using Common.DTOs;
using DataAccessLayer.Entities;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Contracts;
using System.Linq;
using Business.Connectors.Petition;

namespace Business.Connectors
{
    public class UserConnector : BaseConnector<UserDTO, User>, IUserConnector
    {
        public UserConnector(IUserRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        #region Validate Methods

        protected override bool ValidateGet(ReadBusinessPetition petition)
        {
            return petition.RequestingUser != null;
        }

        protected override bool ValidateSave(ReadWriteBusinessPetition<UserDTO> petition)
        {
            return true;
        }

        protected override bool ValidateDelete(ReadWriteBusinessPetition<UserDTO> petition)
        {
            return petition.Data.All(x => x.Id == petition.RequestingUser.Id);
        }

        #endregion
    }
}