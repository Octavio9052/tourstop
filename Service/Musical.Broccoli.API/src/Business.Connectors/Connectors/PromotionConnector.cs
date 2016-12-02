using AutoMapper;
using Business.Connectors.Contracts;
using Business.Connectors.Petition;
using Common.DTOs;
using Common.Enums;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;

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
            return petition.RequestingUser.UserType==UserType.Promoter; //TODO: Think
        }

        protected override bool ValidateDelete(ReadWriteBusinessPetition<PromotionDTO> petition)
        {
            return false; //TODO: Think PromotionCantBeDeleted
        }

        #endregion
    }
}