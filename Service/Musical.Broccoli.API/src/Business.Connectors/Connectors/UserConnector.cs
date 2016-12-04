using System.Linq;
using AutoMapper;
using Business.Connectors.Contracts;
using Business.Connectors.Petition;
using Common.DTOs;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;

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
            return petition.Data.All(x => x.Id == 0) || petition.Data.All(x => x.Id == petition.RequestingUser?.Id);
        }

        protected override bool ValidateDelete(ReadWriteBusinessPetition<UserDTO> petition)
        {
            return petition.RequestingUser != null && petition.Data != null &&
                   petition.Data.All(x => x.Id == petition.RequestingUser.Id);
        }

        #endregion
    }
}