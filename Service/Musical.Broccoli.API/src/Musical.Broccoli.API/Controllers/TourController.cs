using Microsoft.AspNetCore.Mvc;
using Common.DTOs;
using Business.Handlers.Handlers;
using Business.Handlers.Request;
using System;

namespace Musical.Broccoli.API.Controllers
{
    [Route( "api/[controller]" )]
    public class TourController : BaseController<TourDTO>
    {
        public TourController( BaseRequestHandler<TourDTO> requestHandler ) : base( requestHandler )
        {
        }

        public override IActionResult Get( [FromBody] FilteredRequest request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Post( [FromBody] DataRequest<TourDTO> request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Put( [FromBody] DataRequest<TourDTO> request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Delete( [FromBody] FilteredRequest request )
        {
            throw new NotImplementedException();
        }
    }
}