using Business.Connectors.Contracts;
using Business.Contracts;
using Common.DTOs;
using Business.Handlers.Response;
using Business.Handlers.Request;
using Business.Handlers.Validation;

namespace Business.Handlers.Handlers
{
    public abstract class BaseRequestHandler<T> where T : BaseDTO
    {
        private readonly IBaseConnector<T> _connector;
        private readonly BaseValidator<T> _validator;

        protected BaseRequestHandler(IBaseConnector<T> connector, BaseValidator<T> validator)
        {
            _connector = connector;
            _validator = validator;
        }

        public Response<T> HandleReadRequest(ReadRequest request)
        {
        }

        public Response<T> HandleReadWriteRequest(ReadWriteRequest<T> request)
        {
        }

        public Response<T> HandleDeleteRequest(ReadWriteRequest<T> request)
        {
        }
    }
}