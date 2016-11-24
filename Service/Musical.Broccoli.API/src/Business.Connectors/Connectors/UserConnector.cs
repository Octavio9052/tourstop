using Common.DTOs;
using DataAccessLayer.Entities;
using System;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Contracts;
using Business.Controllers.Petition;
using Business.Controllers.PetitionValidators;
using System.Linq;
using Business.Controllers.Response;
using System.Security.Authentication;
using Business.Connectors.Petition;

namespace Business.Connectors
{
    public class UserConnector : BaseConnector<UserDTO, User>, IUserConnector
    {
        public UserConnector(IUserRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }
            protected override BusinessResponse<UserDTO> Get(BusinessPetition<UserDTO> petition)
        {
            if (!Validate(petition, new GetUserValidation())) throw new AuthenticationException();
            return base.Get(petition);
        }
        protected override BusinessResponse<UserDTO> Save(BusinessPetition<UserDTO> petition)
        {
            if (!Validate(petition, new SaveUserValidation())) throw new AuthenticationException();
            return base.Save(petition);
        }
        protected override BusinessResponse<UserDTO> Delete(BusinessPetition<UserDTO> petition)
        {
            if (!Validate(petition, new DeleteAndUpdateUserValidation())) throw new AuthenticationException();
            return base.Delete(petition);
        }
        protected override BusinessResponse<UserDTO> Update(BusinessPetition<UserDTO> petition)
        {
            if (!Validate(petition, new DeleteAndUpdateUserValidation())) throw new AuthenticationException();
            return base.Update(petition);
        }
    }
    

    internal sealed class DeleteAndUpdateUserValidation : PetitionValidation<UserDTO>
    {
        public override bool Validate(BusinessPetition<UserDTO> petition)
        {
            return petition.Data.All(x=>x.Id==petition.RequestingUser.Id);
        }
    }
    internal sealed class GetUserValidation : PetitionValidation<UserDTO>
    {
        public override bool Validate(BusinessPetition<UserDTO> petition)
        {
            return petition.RequestingUser != null;
        }
    }
    internal sealed class SaveUserValidation : PetitionValidation<UserDTO>
    {
        public override bool Validate(BusinessPetition<UserDTO> petition)
        {
            return true;
        }
    }

}

