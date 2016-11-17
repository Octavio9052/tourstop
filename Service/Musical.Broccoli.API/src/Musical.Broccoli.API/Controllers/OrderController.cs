using System;
using Business.Handlers.Handlers;
using Business.Handlers.Request;
using Common.DTOs;
using Microsoft.AspNetCore.Mvc;

namespace Musical.Broccoli.API.Controllers
{

    public class OrderController : BaseController<OrderDTO>
    {
        public OrderController( BaseRequestHandler<OrderDTO> requestHandler ) : base( requestHandler )
        {
        }

        public override IActionResult Get( [FromBody] Request<OrderDTO> request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Post( [FromBody] Request<OrderDTO> request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Put( [FromBody] Request<OrderDTO> request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Delete( [FromBody] Request<OrderDTO> request )
        {
            throw new NotImplementedException();
        }
    }
}
