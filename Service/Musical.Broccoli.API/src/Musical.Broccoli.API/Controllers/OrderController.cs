using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Musical.Broccoli.API.Request;
using Business.Contracts;

namespace Musical.Broccoli.API.Controllers
{

    public class OrderController : BaseController<OrderDTO> {
        public OrderController(IOrderConnector connector) : base(connector)
        {
        }

        [HttpGet]
        public override Request<OrderDTO> Get(Request<OrderDTO> request) {
            throw new NotImplementedException();
        }

        [HttpPost]
        public override Request<OrderDTO> Post([FromBody] Request<OrderDTO> request) {
            throw new NotImplementedException();
        }

        [HttpPut]
        public override void Put([FromBody] Request<OrderDTO> request) {
            throw new NotImplementedException();
        }

        [HttpDelete]
        public override void Delete([FromBody] Request<OrderDTO> request) {
            throw new NotImplementedException();
        }

    }
}
