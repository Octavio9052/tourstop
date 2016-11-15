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
        public override BaseRequest<OrderDTO> Get(BaseRequest<OrderDTO> request) {
            throw new NotImplementedException();
        }

        [HttpPost]
        public override BaseRequest<OrderDTO> Post([FromBody] BaseRequest<OrderDTO> request) {
            throw new NotImplementedException();
        }

        [HttpPut]
        public override void Put([FromBody] BaseRequest<OrderDTO> request) {
            throw new NotImplementedException();
        }

        [HttpDelete]
        public override void Delete([FromBody] BaseRequest<OrderDTO> request) {
            throw new NotImplementedException();
        }

    }
}
