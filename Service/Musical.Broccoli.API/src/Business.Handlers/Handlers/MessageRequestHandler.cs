using Business.Connectors.Contracts;
using Business.Handlers.Authentication.contracts;
using Common.DTOs;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Validation;

namespace Business.Handlers.Handlers
{
    public class MessageRequestHandler : BaseRequestHandler<MessageDTO>, IMessageRequestHandler
    {
        public MessageRequestHandler(IBaseConnector<MessageDTO> connector, BaseValidator<MessageDTO> validator,
            IRequestAuthenticator authenticator) : base(connector, validator, authenticator)
        {
        }
    }
}