using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Business.Contracts;
using Musical.Broccoli.API.Request;
using Musical.Broccoli.API.Response;

namespace Business.Handlers.Handlers
{
    public class UserRequestHandler : BaseRequestHandler<UserDTO>
    {
        public UserRequestHandler(IUserConnector connector) : base(connector)
        {
        }

        public override Response<UserDTO> HandleFilteredRequest(DataRequest<UserDTO> request)
        {
            throw new NotImplementedException();
        }

        public override Response<UserDTO> HandleFilteredRequest(FilteredRequest<UserDTO> request)
        {
            throw new NotImplementedException();
        }
    }
}
