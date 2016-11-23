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

namespace Business.Connectors
{
    public class CheckPointConnector : BaseConnector<CheckPointDTO, CheckPoint>, ICheckPointConnector
    {
        public CheckPointConnector(ICheckPointRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }
        protected override BusinessResponse<CheckPointDTO> Get(BusinessPetition<CheckPointDTO> petition)
        {
            if (!Validate(petition, new CheckPointGetValidation())) throw new AuthenticationException();
            return base.Get(petition);
        }
        protected override BusinessResponse<CheckPointDTO> Save(BusinessPetition<CheckPointDTO> petition)
        {
            if (!Validate(petition, new CheckPointSaveValidation())) throw new AuthenticationException();
            return base.Save(petition);
        }
        protected override BusinessResponse<CheckPointDTO> Delete(BusinessPetition<CheckPointDTO> petition)
        {
            if (!Validate(petition, new CheckPointDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Delete(petition);
        }
        protected override BusinessResponse<CheckPointDTO> Update(BusinessPetition<CheckPointDTO> petition)
        {
            if (!Validate(petition, new CheckPointDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Update(petition);
        }
    }
    internal sealed class CheckPointDeleteAndUpdateValidation : PetitionValidation<CheckPointDTO>
    {
        public override bool Validate(BusinessPetition<CheckPointDTO> petition)
        {
            return false;
        }
    }
    internal sealed class CheckPointGetValidation : PetitionValidation<CheckPointDTO>
    {
        public override bool Validate(BusinessPetition<CheckPointDTO> petition)
        {
            return petition.RequestingUser != null;
        }
    }
    internal sealed class CheckPointSaveValidation : PetitionValidation<CheckPointDTO>
    {
        public override bool Validate(BusinessPetition<CheckPointDTO> petition)
        {
            return petition.RequestingUser != null;
        }
    }
}