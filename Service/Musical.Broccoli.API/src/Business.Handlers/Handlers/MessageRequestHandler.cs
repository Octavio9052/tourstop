using Common.DTOs;
using System;
using Business.Contracts;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Request;
using Business.Handlers.Response;

namespace Business.Handlers.Handlers
{
    public class MessageRequestHandler : BaseRequestHandler<MessageDTO>, IMessageRequestHandler
    {
        public MessageRequestHandler(IMessageConnector connector) : base(connector)
        {
        }

        public override Response<MessageDTO> HandleFilteredRequest( DataRequest<MessageDTO> request )
        {
            throw new NotImplementedException();
        }

        public override Response<MessageDTO> HandleFilteredRequest( FilteredRequest request )
        {
            throw new NotImplementedException();
        }
    }
}
