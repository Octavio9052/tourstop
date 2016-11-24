using Common.DTOs;
using Common.Enums;
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
using Business.Connectors.Petition;

namespace Business.Connectors
{
    public class TourConnector : BaseConnector<TourDTO, Tour>, ITourConnector
    {
        public TourConnector(ITourRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }
        protected override BusinessResponse<TourDTO> Delete(BusinessPetition<TourDTO> petition)
        {
            if (!Validate(petition, new DeleteAndUpdateTourValidation())) throw new AuthenticationException();
            return base.Delete(petition);
        }
        protected override BusinessResponse<TourDTO> Get(BusinessPetition<TourDTO> petition)
        {
            if (!Validate(petition, new GetTourValidation())) throw new AuthenticationException();
            return base.Get(petition);
        }
        protected override BusinessResponse<TourDTO> Save(BusinessPetition<TourDTO> petition)
        {
            if (!Validate(petition, new SaveTourValidation())) throw new AuthenticationException();
            return base.Save(petition);
        }
        protected override BusinessResponse<TourDTO> Update(BusinessPetition<TourDTO> petition)
        {
            if (!Validate(petition, new DeleteAndUpdateTourValidation())) throw new AuthenticationException();
            return base.Update(petition);
        }
    }

internal sealed class DeleteAndUpdateTourValidation : PetitionValidation<TourDTO>
{
    public override bool Validate(BusinessPetition<TourDTO> petition)
    {
        return petition.Data.All(x => x.User.Id == petition.RequestingUser.Id);
    }
}
internal sealed class GetTourValidation : PetitionValidation<TourDTO>
{
    public override bool Validate(BusinessPetition<TourDTO> petition)
    {
        return petition.RequestingUser!=null;
    }
}
internal sealed class SaveTourValidation : PetitionValidation<TourDTO>
{
    public override bool Validate(BusinessPetition<TourDTO> petition)
    {
        return petition.RequestingUser.UserType==UserType.Promotor;
    }
}

}
