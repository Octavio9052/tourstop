using Common.DTOs;
using Business.Handlers.Handlers;
using Microsoft.AspNetCore.Mvc;
using Business.Handlers.Request;

namespace Musical.Broccoli.API.Controllers
{
    public abstract class BaseController<TDto> where TDto : BaseDTO
    {
        private readonly BaseRequestHandler<TDto> _requestHandler;

        public BaseController(BaseRequestHandler<TDto> requestHandler )
        {
            _requestHandler = requestHandler;
        }

        [HttpGet]
        public abstract IActionResult Get( [FromBody] FilteredRequest<TDto> request );

        [HttpPost]
        public abstract IActionResult Post( [FromBody] DataRequest<TDto> request );

        [HttpPut]
        public abstract IActionResult Put( [FromBody] DataRequest<TDto> request );

        [HttpDelete]
        public abstract IActionResult Delete( [FromBody] FilteredRequest<TDto> request );

    }
}