using Business.Connectors.Contracts;
using Business.Handlers.Authentication.contracts;
using Common.DTOs;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Validation;

namespace Business.Handlers.Handlers
{
    public class UserRequestHandler : BaseRequestHandler<UserDTO>, IUserRequestHandler
    {
        public UserRequestHandler(IBaseConnector<UserDTO> connector, BaseValidator<UserDTO> validator,
            IRequestAuthenticator authenticator) : base(connector, validator, authenticator)
        {
        }
    }
}