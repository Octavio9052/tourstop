using Common.DTOs;
using System;
using Business.Connectors.Petition;
using Business.Contracts;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Request;
using Business.Handlers.Response;
using Business.Controllers.Petition;
using Business.Controllers.Response;

namespace Business.Handlers.Handlers
{
    public class MessageRequestHandler : BaseRequestHandler<MessageDTO>, IMessageRequestHandler
    {
        public MessageRequestHandler(IMessageConnector connector) : base(connector)
        {
        }


    }
}