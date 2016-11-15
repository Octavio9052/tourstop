using Microsoft.AspNetCore.Mvc;
using Common.DTOs;
using Musical.Broccoli.API.Request;
using System;
using Business.Contracts;
using Business.Connectors;

namespace Musical.Broccoli.API.Controllers
{
    [Route("api/[controller]")]
    public class UserController : BaseController<UserDTO>
    {
        public UserController(IUserConnector connector) : base(connector)
        {
        }

        public override BaseRequest<UserDTO> Get([FromBody] FilteredRequest<UserDTO> request)
        {
            throw new NotImplementedException();
        }

        public override BaseRequest<UserDTO> Post([FromBody] DataRequest<UserDTO> request)
        {
            throw new NotImplementedException();
        }

        public override void Put([FromBody] DataRequest<UserDTO> request)
        {
            throw new NotImplementedException();
        }

        public override void Delete([FromBody] FilteredRequest<UserDTO> request)
        {
            throw new NotImplementedException();
        }

    }
}