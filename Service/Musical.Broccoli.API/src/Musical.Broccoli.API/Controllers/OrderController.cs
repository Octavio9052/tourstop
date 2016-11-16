using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Musical.Broccoli.API.Request;
using Business.Contracts;
using Musical.Broccoli.API.Response;

namespace Musical.Broccoli.API.Controllers
{

    public class OrderController : BaseController<OrderDTO>
    {
        public OrderController(IOrderConnector connector) : base(connector)
        {
        }

        public override IActionResult Delete([FromBody] FilteredRequest<OrderDTO> request)
        {
            throw new NotImplementedException();
        }

        public override IActionResult Get([FromBody] FilteredRequest<OrderDTO> request)
        {
            throw new NotImplementedException();
        }

        public override IActionResult Post([FromBody] DataRequest<OrderDTO> request)
        {
            throw new NotImplementedException();
        }

        public override IActionResult Put([FromBody] DataRequest<OrderDTO> request)
        {
            throw new NotImplementedException();
        }
    }
}
