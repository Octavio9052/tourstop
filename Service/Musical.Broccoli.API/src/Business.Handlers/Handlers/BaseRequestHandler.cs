using Business.Contracts;
using Common.DTOs;
using Business.Handlers.Response;
using Business.Handlers.Request;

namespace Business.Handlers.Handlers
{
    public abstract class BaseRequestHandler<TDto> where TDto : BaseDTO
    {
        private readonly IBaseConnector<TDto> _connector;

        public BaseRequestHandler(IBaseConnector<TDto> connector)
        {
            _connector = connector;
        }

        public abstract Response<TDto> HandleFilteredRequest(FilteredRequest request);
        public abstract Response<TDto> HandleFilteredRequest(DataRequest<TDto> request);
    }
}
