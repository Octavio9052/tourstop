using Business.Contracts;
using Common.DTOs;
using Musical.Broccoli.API.Response;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Handlers.Handlers
{
    public abstract class BaseRequestHandler<TDto> where TDto : BaseDTO
    {
        private readonly IBaseConnector<TDto> _connector;

        public BaseRequestHandler(IBaseConnector<TDto> connector)
        {
            _connector = connector;
        }

        public abstract Response<TDto> HandleFilteredRequest(Musical.Broccoli.API.Request.FilteredRequest<TDto> request);
        public abstract Response<TDto> HandleFilteredRequest(Musical.Broccoli.API.Request.DataRequest<TDto> request);
    }
}
