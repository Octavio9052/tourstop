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

        public override IActionResult Delete( [FromBody] FilteredRequest<OrderDTO> request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Get( [FromBody] FilteredRequest<OrderDTO> request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Post( [FromBody] DataRequest<OrderDTO> request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Put( [FromBody] DataRequest<OrderDTO> request )
        {
            throw new NotImplementedException();
        }
    }
}
