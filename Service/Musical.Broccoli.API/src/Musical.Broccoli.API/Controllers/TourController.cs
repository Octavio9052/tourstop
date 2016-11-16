using Microsoft.AspNetCore.Mvc;
using Common.DTOs;
using Musical.Broccoli.API.Request;
using System;
using Business.Contracts;

namespace Musical.Broccoli.API.Controllers
{
    [Route("api/[controller]")]
    public class TourController : BaseController<TourDTO> {
        public TourController(ITourConnector connector) : base(connector)
        {
        }

        public override IActionResult Delete([FromBody] FilteredRequest<TourDTO> request)
        {
            throw new NotImplementedException();
        }

        public override IActionResult Get([FromBody] FilteredRequest<TourDTO> request)
        {
            throw new NotImplementedException();
        }

        public override IActionResult Post([FromBody] DataRequest<TourDTO> request)
        {
            throw new NotImplementedException();
        }

        public override IActionResult Put([FromBody] DataRequest<TourDTO> request)
        {
            throw new NotImplementedException();
        }
    }
}