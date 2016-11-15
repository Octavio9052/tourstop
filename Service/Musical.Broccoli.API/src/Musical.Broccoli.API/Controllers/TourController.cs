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

        // GET api/users
        [HttpGet]
        public override BaseRequest<TourDTO> Get([FromBody] BaseRequest<TourDTO> request) {
            throw new NotImplementedException();
        }
        // POST api/users
        [HttpPost]
        public override BaseRequest<TourDTO> Post([FromBody] BaseRequest<TourDTO> request) {
            throw new NotImplementedException();
        }
        
        // PUT api/users
        [HttpPut]
        public override void Put([FromBody] BaseRequest<TourDTO> request) {
            throw new NotImplementedException();
        }

        // DELETE api/users
        [HttpDelete]
        public override void Delete([FromBody] BaseRequest<TourDTO> request) {
            throw new NotImplementedException();
        }
    }
}