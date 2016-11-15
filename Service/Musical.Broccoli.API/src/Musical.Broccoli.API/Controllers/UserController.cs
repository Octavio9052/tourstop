using Microsoft.AspNetCore.Mvc;
using Common.DTOs;
using Musical.Broccoli.API.Request;
using System;
using Business.Contracts;
using Business.Connectors;

namespace Musical.Broccoli.API.Controllers
{
    [Route("api/[controller]")]
    public class UserController : BaseController<UserDTO> {
        public UserController(IUserConnector connector) : base(connector)
        {
        }

        [HttpGet]
        public override BaseRequest<UserDTO> Get(BaseRequest<UserDTO> request) {
            throw new NotImplementedException();
        }

        [HttpPost]
        public override BaseRequest<UserDTO> Post([FromBody] BaseRequest<UserDTO> request) {
            throw new NotImplementedException();
        }

        [HttpPut]
        public override void Put([FromBody] BaseRequest<UserDTO> request) {
            throw new NotImplementedException();
        }

        [HttpDelete]
        public override void Delete([FromBody] BaseRequest<UserDTO> request) {
            throw new NotImplementedException();
        }

    }
}