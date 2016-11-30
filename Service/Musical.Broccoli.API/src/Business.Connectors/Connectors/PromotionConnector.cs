using Common.DTOs;
using DataAccessLayer.Entities;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Contracts;
using Business.Connectors.Petition;

namespace Business.Connectors
{
    public class PromotionConnector : BaseConnector<PromotionDTO, Promotion>, IPromotionConnector
    {
        public PromotionConnector(IPromotionRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        #region Validate Methods

        protected override bool ValidateGet(ReadBusinessPetition petition)
        {
            return petition.RequestingUser != null;
        }

        protected override bool ValidateSave(ReadWriteBusinessPetition<PromotionDTO> petition)
        {
            return true; //TODO: Think
        }

        protected override bool ValidateDelete(ReadWriteBusinessPetition<PromotionDTO> petition)
        {
            return true; //TODO: Think
        }

        #endregion
    }
}