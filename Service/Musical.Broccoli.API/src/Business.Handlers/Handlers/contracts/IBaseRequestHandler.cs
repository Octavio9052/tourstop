using Business.Handlers.Request;
using Business.Handlers.Response;
using Common.DTOs;

namespace Business.Handlers.Handlers.contracts
{
    public interface IBaseRequestHandler<T> where T : BaseDTO
    {
        Response<T> HandleReadRequest(ReadRequest request);

        Response<T> HandleReadWriteRequest(ReadWriteRequest<T> request);

        Response<T> HandleDeleteRequest(ReadWriteRequest<T> request);
    }
}