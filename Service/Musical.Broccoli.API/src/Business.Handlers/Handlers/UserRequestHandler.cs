using Common.DTOs;
using System;
using Business.Contracts;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Request;
using Business.Handlers.Response;

namespace Business.Handlers.Handlers
{
    public class UserRequestHandler : BaseRequestHandler<UserDTO>, IUserRequestHandler
    {
        public UserRequestHandler(IUserConnector connector) : base(connector)
        {
        }

        public override Response<UserDTO> HandleRequest( Request<UserDTO> request )
        {
            throw new NotImplementedException();
        }
    }
}
