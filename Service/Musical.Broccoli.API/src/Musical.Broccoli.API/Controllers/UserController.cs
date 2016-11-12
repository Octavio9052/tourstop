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
        public override Request<UserDTO> Get(Request<UserDTO> request) {
            throw new NotImplementedException();
        }

        [HttpPost]
        public override Request<UserDTO> Post([FromBody] Request<UserDTO> request) {
            throw new NotImplementedException();
        }

        [HttpPut]
        public override void Put([FromBody] Request<UserDTO> request) {
            throw new NotImplementedException();
        }

        [HttpDelete]
        public override void Delete([FromBody] Request<UserDTO> request) {
            throw new NotImplementedException();
        }

    }
}