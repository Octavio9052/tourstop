using Common.DTOs;
using DataAccessLayer.Entities;
using AutoMapper;
using Business.Connectors.Contracts;
using DataAccessLayer.Repositories.Contracts;
using Business.Connectors.Petition;

namespace Business.Connectors
{
    public class MessageConnector : BaseConnector<MessageDTO, Message>, IMessageConnector
    {
        public MessageConnector(IMessageRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        #region Validate Methods

        protected override bool ValidateGet(ReadBusinessPetition petition)
        {
            return petition.RequestingUser != null;
        }

        protected override bool ValidateSave(ReadWriteBusinessPetition<MessageDTO> petition)
        {
            return petition.RequestingUser != null;
        }

        protected override bool ValidateDelete(ReadWriteBusinessPetition<MessageDTO> petition)
        {
            return false;
        }

        #endregion
    }
}