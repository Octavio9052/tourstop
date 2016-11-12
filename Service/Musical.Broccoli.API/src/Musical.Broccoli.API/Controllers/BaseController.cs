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

        // GET api/TDto
        public abstract Request.Request<TDto> Get(Request.Request<TDto> request);

        // POST api/TDto
        public abstract Request.Request<TDto> Post([FromBody] Request.Request<TDto> request);

        // PUT api/TDto
        public abstract void Put([FromBody] Request.Request<TDto> request);

        // DELETE api/TDto
        public abstract void Delete([FromBody] Request.Request<TDto> request);
    }
}