using Common.DTOs;
using DataAccessLayer.Entities;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using System;
using Business.Contracts;
using Business.Controllers.Petition;
using Business.Controllers.PetitionValidators;
using Business.Controllers.Response;
using System.Security.Authentication;
using Business.Connectors.Petition;

namespace Business.Connectors
{
    public class RatingConnector : BaseConnector<RatingDTO, Rating>, IRatingConnector
    {
        public RatingConnector(IRatingRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }
            protected override BusinessResponse<RatingDTO> Save(BusinessPetition<RatingDTO> petition)
        {
            if (!Validate(petition, new RatingSaveValidation())) throw new AuthenticationException();
            return base.Save(petition);
        }
        protected override BusinessResponse<RatingDTO> Get(BusinessPetition<RatingDTO> petition)
        {
            if (!Validate(petition, new RatingGetValidation())) throw new AuthenticationException();
            return base.Get(petition);
        }
        protected override BusinessResponse<RatingDTO> Delete(BusinessPetition<RatingDTO> petition)
        {
            if (!Validate(petition, new RatingDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Delete(petition);
        }
        protected override BusinessResponse<RatingDTO> Update(BusinessPetition<RatingDTO> petition)
        {
            if (!Validate(petition, new RatingDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Update(petition);
        }
    }

        internal sealed class RatingDeleteAndUpdateValidation : PetitionValidation<RatingDTO>
        {
            public override bool Validate(BusinessPetition<RatingDTO> petition)
            {
                return true;
            }
        }
        internal sealed class RatingGetValidation : PetitionValidation<RatingDTO>
        {
            public override bool Validate(BusinessPetition<RatingDTO> petition)
            {
                return petition.RequestingUser != null;
            }
        }
        internal sealed class RatingSaveValidation : PetitionValidation<RatingDTO>
        {
            public override bool Validate(BusinessPetition<RatingDTO> petition)
            {
                return true;
            }
        }
    }

