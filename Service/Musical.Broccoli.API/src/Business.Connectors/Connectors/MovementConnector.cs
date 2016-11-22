using Common.DTOs;
using DataAccessLayer.Entities;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Contracts;
using Business.Controllers.Petition;
using System;
using Business.Controllers.Response;
using System.Security.Authentication;
using Business.Controllers.PetitionValidators;
using System.Linq;

namespace Business.Connectors
{
    public class MovementConnector : BaseConnector<MovementDTO, Movement>, IMovementConnector
    {
        public MovementConnector(IMovementRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }
        protected override BusinessResponse<MovementDTO> Get(BusinessPetition<MovementDTO> petition)
        {
            if (!Validate(petition, new MovementGetValidation())) throw new AuthenticationException();
            return base.Get(petition);
        }
        protected override BusinessResponse<MovementDTO> Save(BusinessPetition<MovementDTO> petition)
        {
            if (!Validate(petition, new MovementSaveValidation())) throw new AuthenticationException();
            return base.Save(petition);
        }
        protected override BusinessResponse<MovementDTO> Delete(BusinessPetition<MovementDTO> petition)
        {
            if (!Validate(petition, new MovementDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Delete(petition);
        }
        protected override BusinessResponse<MovementDTO> Update(BusinessPetition<MovementDTO> petition)
        {
            if (!Validate(petition, new MovementDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Update(petition);
        }
    }
    internal sealed class MovementDeleteAndUpdateValidation : PetitionValidation<MovementDTO>
    {
        public override bool Validate(BusinessPetition<MovementDTO> petition)
        {
            return false;
        }
    }
    internal sealed class MovementGetValidation : PetitionValidation<MovementDTO>
    {
        public override bool Validate(BusinessPetition<MovementDTO> petition)
        {
            return petition.RequestingUser != null;
        }
    }
    internal sealed class MovementSaveValidation : PetitionValidation<MovementDTO>
    {
        public override bool Validate(BusinessPetition<MovementDTO> petition)
        {
            return petition.RequestingUser != null;
        }
    }
}

