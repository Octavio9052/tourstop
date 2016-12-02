using Business.Connectors.Contracts;
using Business.Handlers.Authentication.contracts;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Validation;
using Business.Handlers.Validation.Dto;
using Common.DTOs;

namespace Business.Handlers.Handlers
{
    public class UserRequestHandler : BaseRequestHandler<UserDTO>, IUserRequestHandler
    {
        public UserRequestHandler(IBaseConnector<UserDTO> connector, IRequestAuthenticator authenticator)
            : base(connector, authenticator)
        {
        }

        protected override BaseValidator<UserDTO> FullValidator => UserValidator.All();
        protected override BaseValidator<UserDTO> DeleteValidator => UserValidator.HasId();
    }
}