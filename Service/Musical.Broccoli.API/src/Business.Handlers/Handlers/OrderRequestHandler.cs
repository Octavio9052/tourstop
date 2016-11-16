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
    public class OrderRequestHandler : BaseRequestHandler<OrderDTO>, IOrderRequestHandler
    {
        public OrderRequestHandler(IOrderConnector connector) : base(connector)
        {
        }

        public override Response<OrderDTO> HandleFilteredRequest(DataRequest<OrderDTO> request)
        {
            throw new NotImplementedException();
        }

        public override Response<OrderDTO> HandleFilteredRequest(FilteredRequest<OrderDTO> request)
        {
            throw new NotImplementedException();
        }
    }
}
