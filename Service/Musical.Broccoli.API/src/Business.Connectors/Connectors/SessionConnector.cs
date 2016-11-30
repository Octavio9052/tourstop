using Common.DTOs;
using DataAccessLayer.Entities;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Contracts;
using Business.Connectors.Petition;

namespace Business.Connectors
{
    public class SessionConnector : BaseConnector<SessionDTO, Session>, ISessionConnector
    {
        public SessionConnector(IBaseRepository<Session> repository, IMapper mapper) : base(repository, mapper)
        {
        }

        #region Validate Methods

        protected override bool ValidateGet(ReadBusinessPetition petition)
        {
            return petition.RequestingUser != null;
        }

        protected override bool ValidateSave(ReadWriteBusinessPetition<SessionDTO> petition)
        {
            return true;
        }

        protected override bool ValidateDelete(ReadWriteBusinessPetition<SessionDTO> petition)
        {
            return true;
        }

        #endregion
    }
}