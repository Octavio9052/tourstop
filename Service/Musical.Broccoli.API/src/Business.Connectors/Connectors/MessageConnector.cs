using Common.DTOs;
using DataAccessLayer.Entities;
using System;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Contracts;
using Business.Controllers.Petition;
using Business.Controllers.Response;
using Business.Controllers.PetitionValidators;
using System.Security.Authentication;

namespace Business.Connectors
{
    public class MessageConnector : BaseConnector<MessageDTO, Message>, IMessageConnector
    {
        public MessageConnector(IMessageRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }
        protected override BusinessResponse<MessageDTO> Get(BusinessPetition<MessageDTO> petition)
        {
            if (!Validate(petition, new MessageGetValidation())) throw new AuthenticationException();
            return base.Get(petition);
        }
        protected override BusinessResponse<MessageDTO> Save(BusinessPetition<MessageDTO> petition)
        {
            if (!Validate(petition, new MessageSaveValidation())) throw new AuthenticationException();
            return base.Save(petition);
        }
        protected override BusinessResponse<MessageDTO> Delete(BusinessPetition<MessageDTO> petition)
        {
            if (!Validate(petition, new MessageDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Delete(petition);
        }
        protected override BusinessResponse<MessageDTO> Update(BusinessPetition<MessageDTO> petition)
        {
            if (!Validate(petition, new MessageDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Update(petition);
        }
    }
    internal sealed class MessageDeleteAndUpdateValidation : PetitionValidation<MessageDTO>
    {
        public override bool Validate(BusinessPetition<MessageDTO> petition)
        {
            return false;
        }
    }
    internal sealed class MessageGetValidation : PetitionValidation<MessageDTO>
    {
        public override bool Validate(BusinessPetition<MessageDTO> petition)
        {
            return petition.RequestingUser != null;
        }
    }
    internal sealed class MessageSaveValidation : PetitionValidation<MessageDTO>
    {
        public override bool Validate(BusinessPetition<MessageDTO> petition)
        {
            return petition.RequestingUser != null;
        }
    }
}