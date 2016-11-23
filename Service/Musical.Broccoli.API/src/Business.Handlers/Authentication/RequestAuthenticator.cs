using System;
using Business.Contracts;
using Common.DTOs;

namespace Handlers.Authentication
{
    public class RequestAuthenticator
    {

        private readonly ISessionConnector _connector;

        public RequestAuthenticator( ISessionConnector connector )
        {
            _connector = connector;
        }


        public UserDTO Aunthenticate(string authToken )
        {
            //_connector.
            throw new NotImplementedException();
        }
    }
}
