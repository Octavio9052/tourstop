using Common.DTOs;
using Business.Handlers.Handlers;
using Microsoft.AspNetCore.Mvc;
using Business.Handlers.Request;
using System;

namespace Musical.Broccoli.API.Controllers
{
    public abstract class BaseController<TDto> where TDto : BaseDTO
    {
        protected readonly BaseRequestHandler<TDto> _requestHandler;

        public BaseController(BaseRequestHandler<TDto> requestHandler )
        {
            _requestHandler = requestHandler;
        }

        [HttpGet]
        public abstract IActionResult Get( [FromBody] Request request );

        [HttpPost]
        public abstract IActionResult Post( [FromBody] Request request );

        [HttpPut]
        public abstract IActionResult Put( [FromBody] Request request );

        [HttpDelete]
        public abstract IActionResult Delete( [FromBody] Request request );

        protected void HandleException(Exception ex )
        {
            
        }

    }
}