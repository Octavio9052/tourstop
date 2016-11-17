using System;
using Business.Handlers.Handlers;
using Business.Handlers.Request;
using Common.DTOs;
using Microsoft.AspNetCore.Mvc;

namespace Musical.Broccoli.API.Controllers
{
    [Route( "api/[controller]" )]
    public class MessageController : BaseController<MessageDTO>
    {
        public MessageController( BaseRequestHandler<MessageDTO> requestHandler ) : base( requestHandler )
        {
        }

        public override IActionResult Get( [FromBody] FilteredRequest request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Post( [FromBody] DataRequest<MessageDTO> request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Put( [FromBody] DataRequest<MessageDTO> request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Delete( [FromBody] FilteredRequest request )
        {
            throw new NotImplementedException();
        }
    }
}
