using Business.Contracts;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Handlers.Handlers
{
    public class TourRequestHandler : BaseRequestHandler<TourDTO>
    {
        public TourRequestHandler(ITourConnector connector) : base(connector)
        {
        }

        public override Musical.Broccoli.API.Response.Response<TourDTO> HandleFilteredRequest(Musical.Broccoli.API.Request.DataRequest<TourDTO> request)
        {
            throw new NotImplementedException();
        }

        public override Musical.Broccoli.API.Response.Response<TourDTO> HandleFilteredRequest(Musical.Broccoli.API.Request.FilteredRequest<TourDTO> request)
        {
            throw new NotImplementedException();
        }
    }
}
