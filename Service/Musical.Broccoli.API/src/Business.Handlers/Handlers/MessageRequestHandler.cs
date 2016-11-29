using Common.DTOs;
using System;
using Business.Connectors.Petition;
using Business.Contracts;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Request;
using Business.Handlers.Response;
using Business.Controllers.Petition;
using Business.Controllers.Response;
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