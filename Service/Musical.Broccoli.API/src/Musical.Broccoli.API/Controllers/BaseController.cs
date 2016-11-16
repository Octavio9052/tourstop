using Microsoft.AspNetCore.Mvc;
using Common.DTOs;
using Business.Contracts;
using Musical.Broccoli.API.Response;

namespace Musical.Broccoli.API.Controllers
{
    public abstract class BaseController<TDto> where TDto : BaseDTO
    {

        protected readonly IBaseConnector<TDto> _connector;

        public BaseController(IBaseConnector<TDto> connector)
        {
            _connector = connector;
        }

        [HttpGet]
        // GET api/TDto
        public abstract IActionResult Get([FromBody] Request.FilteredRequest<TDto> request);
        [HttpPost]
        // POST api/TDto
        public abstract IActionResult Post([FromBody] Request.DataRequest<TDto> request);
        [HttpPut]
        // PUT api/TDto
        public abstract IActionResult Put([FromBody] Request.DataRequest<TDto> request);
        [HttpDelete]
        // DELETE api/TDto
        public abstract IActionResult Delete([FromBody] Request.FilteredRequest<TDto> request);
    }
}