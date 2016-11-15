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
    [Route("api/[controller]")]
    public class MessageController : BaseController<MessageDTO> {
        public MessageController(IMessageConnector connector) : base(connector)
        {
        }

        [HttpGet]
        public override BaseRequest<MessageDTO> Get(BaseRequest<MessageDTO> request) {
            throw new NotImplementedException();
        }

        [HttpPost]
        public override BaseRequest<MessageDTO> Post([FromBody] BaseRequest<MessageDTO> request) {
            throw new NotImplementedException();
        }

        [HttpPut]
        public override void Put([FromBody] BaseRequest<MessageDTO> request) {
            throw new NotImplementedException();
        }

        [HttpDelete]
        public override void Delete([FromBody] BaseRequest<MessageDTO> request) {
            throw new NotImplementedException();
        }
    }
}
