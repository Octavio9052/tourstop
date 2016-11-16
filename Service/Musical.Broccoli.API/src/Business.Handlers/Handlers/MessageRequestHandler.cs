using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Business.Contracts;
using Musical.Broccoli.API.Request;
using Musical.Broccoli.API.Response;
using Business.Handlers.Handlers.contracts;

namespace Business.Handlers.Handlers
{
    public class MessageRequestHandler : BaseRequestHandler<MessageDTO>, IMessageRequestHandler
    {
        public MessageRequestHandler(IMessageConnector connector) : base(connector)
        {
        }

        public override Response<MessageDTO> HandleFilteredRequest(DataRequest<MessageDTO> request)
        {
            throw new NotImplementedException();
        }

        public override Response<MessageDTO> HandleFilteredRequest(FilteredRequest<MessageDTO> request)
        {
            throw new NotImplementedException();
        }
    }
}
