using Business.Handlers.Request;
using Business.Handlers.Response;
using Common.DTOs;

namespace Business.Handlers.Handlers.contracts
{
    public interface IBaseRequestHandler<TDto> where TDto : BaseDTO
    {
        Response<TDto> HandleRequest( Request<TDto> request );
    }
}
