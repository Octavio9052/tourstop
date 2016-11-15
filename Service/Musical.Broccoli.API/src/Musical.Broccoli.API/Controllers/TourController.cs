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

        public override BaseRequest<TourDTO> Get([FromBody] FilteredRequest<TourDTO> request)
        {
            throw new NotImplementedException();
        }

        public override BaseRequest<TourDTO> Post([FromBody] DataRequest<TourDTO> request)
        {
            throw new NotImplementedException();
        }

        public override void Put([FromBody] DataRequest<TourDTO> request)
        {
            throw new NotImplementedException();
        }

        public override void Delete([FromBody] FilteredRequest<TourDTO> request)
        {
            throw new NotImplementedException();
        }

    }
}