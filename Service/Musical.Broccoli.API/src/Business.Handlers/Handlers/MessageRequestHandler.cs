using Common.DTOs;
using Business.Contracts;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Validation;

namespace Business.Handlers.Handlers
{
    public class MessageRequestHandler : BaseRequestHandler<MessageDTO>, IMessageRequestHandler
    {
        public MessageRequestHandler(IMessageConnector connector, MessageValidator validator)
            : base(connector, validator)
        {
        }
    }
}