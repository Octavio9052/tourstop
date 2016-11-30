using Common.DTOs;
using System;
using Business.Contracts;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Response;
using Business.Handlers.Validation;

namespace Business.Handlers.Handlers
{
    public class UserRequestHandler : BaseRequestHandler<UserDTO>, IUserRequestHandler
    {
        public UserRequestHandler(IUserConnector connector, UserValidator validator) : base(connector, validator)
        {
        }
    }
}