using Business.Connectors.Contracts;
using Business.Handlers.Authentication.contracts;
using Common.DTOs;

namespace Business.Handlers.Authentication
{
    public class RequestAuthenticator : IRequestAuthenticator
    {
        private readonly ISessionConnector _connector;

        public RequestAuthenticator(ISessionConnector connector)
        {
            _connector = connector;
        }


        public UserDTO Authenticate(string authToken)
        {
            return _connector.Authenticate(authToken);
        }
    }
}