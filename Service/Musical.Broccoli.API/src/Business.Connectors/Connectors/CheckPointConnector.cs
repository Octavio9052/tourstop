using Common.DTOs;
using DataAccessLayer.Entities;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Contracts;
using Business.Connectors.Petition;

namespace Business.Connectors
{
    public class CheckPointConnector : BaseConnector<CheckPointDTO, CheckPoint>, ICheckPointConnector
    {
        public CheckPointConnector(ICheckPointRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        #region Validate Methods

        protected override bool ValidateGet(ReadBusinessPetition petition)
        {
            return petition.RequestingUser != null;
        }

        protected override bool ValidateSave(ReadWriteBusinessPetition<CheckPointDTO> petition)
        {
            return petition.RequestingUser != null;
        }

        protected override bool ValidateDelete(ReadWriteBusinessPetition<CheckPointDTO> petition)
        {
            return false;
        }

        #endregion
    }
}