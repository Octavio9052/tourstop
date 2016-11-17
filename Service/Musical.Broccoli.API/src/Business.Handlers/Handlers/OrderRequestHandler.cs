using Common.DTOs;
using System;
using Business.Contracts;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Request;
using Business.Handlers.Response;
using Business.Controllers.Petition;

namespace Business.Handlers.Handlers
{
    public class OrderRequestHandler : BaseRequestHandler<OrderDTO>, IOrderRequestHandler
    {
        public OrderRequestHandler( IOrderConnector connector ) : base( connector )
        {
        }

        public override Response<OrderDTO> HandleFilteredRequest( DataRequest<OrderDTO> request )
        {
            var petition = (DataBusinessPetition<OrderDTO>) request;
            throw new NotImplementedException();
        }

        public override Response<OrderDTO> HandleFilteredRequest( FilteredRequest request )
        {
            var petition = (BusinessPetition) request;
            throw new NotImplementedException();
        }
    }
}
