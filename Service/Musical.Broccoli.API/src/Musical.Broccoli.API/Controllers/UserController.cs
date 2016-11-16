using Microsoft.AspNetCore.Mvc;
using Common.DTOs;
using Musical.Broccoli.API.Request;
using System;
using Business.Contracts;
using Business.Connectors;
using Musical.Broccoli.API.Response;

namespace Musical.Broccoli.API.Controllers
{
    [Route("api/[controller]")]
    public class UserController : BaseController<UserDTO>
    {
        public UserController(IUserConnector connector) : base(connector)
        {
        }

        public override IActionResult Delete([FromBody] FilteredRequest<UserDTO> request)
        {
            throw new NotImplementedException();
        }

        public override IActionResult Get([FromBody] FilteredRequest<UserDTO> request)
        {
            throw new NotImplementedException();
        }

        public override IActionResult Post([FromBody] DataRequest<UserDTO> request)
        {
            throw new NotImplementedException();
        }

        public override IActionResult Put([FromBody] DataRequest<UserDTO> request)
        {
            throw new NotImplementedException();
        }
    }
}