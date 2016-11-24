using Common.DTOs;
using DataAccessLayer.Entities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Contracts;
using Business.Controllers.Petition;
using Business.Controllers.PetitionValidators;
using Business.Controllers.Response;
using System.Security.Authentication;

namespace Business.Connectors
{
    public class PromotionConnector : BaseConnector<PromotionDTO, Promotion>, IPromotionConnector
    {
        public PromotionConnector(IPromotionRepository repository, IMapper mapper) : base(repository, mapper)
        {

        }
        protected override BusinessResponse<PromotionDTO> Get(BusinessPetition<PromotionDTO> petition)
        {
            if (!Validate(petition, new PromotionGetValidation())) throw new AuthenticationException();
            return base.Get(petition);
        }
        protected override BusinessResponse<PromotionDTO> Save(BusinessPetition<PromotionDTO> petition)
        {
            if (!Validate(petition, new PromotionSaveValidation())) throw new AuthenticationException();
            return base.Save(petition);
        }
        protected override BusinessResponse<PromotionDTO> Delete(BusinessPetition<PromotionDTO> petition)
        {
            if (!Validate(petition, new PromotionDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Delete(petition);
        }
        protected override BusinessResponse<PromotionDTO> Update(BusinessPetition<PromotionDTO> petition)
        {
            if (!Validate(petition, new PromotionDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Update(petition);
        }
    }
        
        internal sealed class PromotionDeleteAndUpdateValidation : PetitionValidation<PromotionDTO>
        {
            public override bool Validate(BusinessPetition<PromotionDTO> petition)
            {
                return (petition.Data != null && petition.Data.All(x => x.Id == petition.RequestingUser.Id)) || (String.IsNullOrEmpty(petition.FilterString.ToString())); ;
            }
        }
        internal sealed class PromotionGetValidation : PetitionValidation<PromotionDTO>
        {
            public override bool Validate(BusinessPetition<PromotionDTO> petition)
            {
                return petition.RequestingUser != null;
            }
        }
        internal sealed class PromotionSaveValidation : PetitionValidation<PromotionDTO>
        {
            public override bool Validate(BusinessPetition<PromotionDTO> petition)
            {
                return true;
            }
        }

    
}
