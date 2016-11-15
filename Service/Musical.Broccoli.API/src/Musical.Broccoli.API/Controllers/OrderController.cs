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

    public class OrderController : BaseController<OrderDTO>
    {
        public OrderController(IBaseConnector<OrderDTO> connector) : base(connector)
        {
        }

        public override BaseRequest<OrderDTO> Get([FromBody] FilteredRequest<OrderDTO> request)
        {
            throw new NotImplementedException();
        }

        public override BaseRequest<OrderDTO> Post([FromBody] DataRequest<OrderDTO> request)
        {
            throw new NotImplementedException();
        }

        public override void Put([FromBody] DataRequest<OrderDTO> request)
        {
            throw new NotImplementedException();
        }

        public override void Delete([FromBody] FilteredRequest<OrderDTO> request)
        {
            throw new NotImplementedException();
        }
    }
}
