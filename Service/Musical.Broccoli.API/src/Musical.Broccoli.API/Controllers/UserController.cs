using Microsoft.AspNetCore.Mvc;
using Common.DTOs;
using Business.Handlers.Handlers;
using Business.Handlers.Request;
using System;

namespace Musical.Broccoli.API.Controllers
{
    [Route( "api/[controller]" )]
    public class UserController : BaseController<UserDTO>
    {
        public UserController( BaseRequestHandler<UserDTO> requestHandler ) : base( requestHandler )
        {
        }

        public override IActionResult Get( [FromBody] FilteredRequest request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Post( [FromBody] DataRequest<UserDTO> request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Put( [FromBody] DataRequest<UserDTO> request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Delete( [FromBody] FilteredRequest request )
        {
            throw new NotImplementedException();
        }
    }
}