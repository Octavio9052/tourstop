using Common.DTOs;

namespace Business.Connectors.Contracts
{
    public interface ISessionConnector
    {
        SessionDTO Create(UserDTO userDto);

        UserDTO Authenticate(string authToken);
    }
}