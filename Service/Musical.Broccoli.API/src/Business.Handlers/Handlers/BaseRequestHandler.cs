using Business.Connectors.Contracts;
using Business.Contracts;
using Common.DTOs;
using Business.Handlers.Response;
using Business.Handlers.Request;

namespace Business.Handlers.Handlers
{
    public abstract class BaseRequestHandler<T> where T : BaseDTO
    {
        protected readonly IBaseConnector<T> Connector;

        protected BaseRequestHandler(IBaseConnector<T> connector)
        {
            Connector = connector;
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