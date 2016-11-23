    using Business.Handlers.Request;
using Business.Handlers.Response;
using Common.DTOs;

namespace Business.Handlers.Handlers.contracts
{
    public interface IUserRequestHandler
    {
        Response<UserDTO> HandleRequest(Request<UserDTO> request);
    }
}
