using Microsoft.AspNetCore.Mvc;
using Common.DTOs;
using Business.Contracts;

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
        public abstract Request.BaseRequest<TDto> Get([FromBody] Request.FilteredRequest<TDto> request);
        [HttpPost]
        // POST api/TDto
        public abstract Request.BaseRequest<TDto> Post([FromBody] Request.DataRequest<TDto> request);
        [HttpPut]
        // PUT api/TDto
        public abstract void Put([FromBody] Request.DataRequest<TDto> request);
        [HttpDelete]
        // DELETE api/TDto
        public abstract void Delete([FromBody] Request.FilteredRequest<TDto> request);
    }
}