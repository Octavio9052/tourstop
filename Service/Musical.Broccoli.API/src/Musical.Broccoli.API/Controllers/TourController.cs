﻿using Microsoft.AspNetCore.Mvc;
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

        public override IActionResult Get( [FromBody] Request<TourDTO> request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Post( [FromBody] Request<TourDTO> request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Put( [FromBody] Request<TourDTO> request )
        {
            throw new NotImplementedException();
        }

        public override IActionResult Delete( [FromBody] Request<TourDTO> request )
        {
            throw new NotImplementedException();
        }
    }
}