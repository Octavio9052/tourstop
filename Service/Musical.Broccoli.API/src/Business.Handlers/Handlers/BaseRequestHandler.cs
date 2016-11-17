using Business.Contracts;
using Common.DTOs;
using Business.Handlers.Response;
using Business.Handlers.Request;

namespace Business.Handlers.Handlers
{
    public abstract class BaseRequestHandler<TDto> where TDto : BaseDTO
    {
        protected readonly IBaseConnector<TDto> _connector;

        public BaseRequestHandler(IBaseConnector<TDto> connector)
        {
            _connector = connector;
        }

        public abstract Response<TDto> HandleRequest(Request<TDto> request);
    }
}
