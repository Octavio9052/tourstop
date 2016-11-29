using Business.Contracts;
using Common.DTOs;
using System;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Response;

namespace Business.Handlers.Handlers
{
    public class TourRequestHandler : BaseRequestHandler<TourDTO>, ITourRequestHandler
    {
        public TourRequestHandler(ITourConnector connector) : base(connector)
        {
        }

        public override Response<TourDTO> HandleRequest( Request.Request request )
        {
            throw new NotImplementedException();
        }
    }
}
