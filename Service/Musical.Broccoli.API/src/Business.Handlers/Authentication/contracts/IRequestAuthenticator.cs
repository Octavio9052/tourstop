using Common.DTOs;

namespace Business.Handlers.Authentication.contracts
{
    public interface IRequestAuthenticator
    {
        UserDTO Authenticate(string authToken);
    }
}