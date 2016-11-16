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
    [Route("api/[controller]")]
    public class MessageController : BaseController<MessageDTO>
    {
        public MessageController(IBaseConnector<MessageDTO> connector) : base(connector)
        {
        }

        public override IActionResult Delete([FromBody] FilteredRequest<MessageDTO> request)
        {
            throw new NotImplementedException();
        }

        public override IActionResult Get([FromBody] FilteredRequest<MessageDTO> request)
        {
            throw new NotImplementedException();
        }

        public override IActionResult Post([FromBody] DataRequest<MessageDTO> request)
        {
            throw new NotImplementedException();
        }

        public override IActionResult Put([FromBody] DataRequest<MessageDTO> request)
        {
            throw new NotImplementedException();
        }
    }
}
