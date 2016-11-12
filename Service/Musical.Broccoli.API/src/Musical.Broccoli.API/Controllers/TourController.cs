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
        public override Request<TourDTO> Get([FromBody] Request<TourDTO> request) {
            throw new NotImplementedException();
        }
        // POST api/users
        [HttpPost]
        public override Request<TourDTO> Post([FromBody] Request<TourDTO> request) {
            throw new NotImplementedException();
        }
        
        // PUT api/users
        [HttpPut]
        public override void Put([FromBody] Request<TourDTO> request) {
            throw new NotImplementedException();
        }

        // DELETE api/users
        [HttpDelete]
        public override void Delete([FromBody] Request<TourDTO> request) {
            throw new NotImplementedException();
        }
    }
}