using Common.DTOs;
using System;
using Business.Contracts;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Request;
using Business.Handlers.Response;

namespace Business.Handlers.Handlers
{
    public class OrderRequestHandler : BaseRequestHandler<OrderDTO>, IOrderRequestHandler
    {
        public OrderRequestHandler(IOrderConnector connector) : base(connector)
        {
        }

        public override Response<OrderDTO> HandleFilteredRequest( DataRequest<OrderDTO> request )
        {
            throw new NotImplementedException();
        }

        public override Response<OrderDTO> HandleFilteredRequest( FilteredRequest<OrderDTO> request )
        {
            throw new NotImplementedException();
        }
    }
}
