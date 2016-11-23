using Microsoft.AspNetCore.Mvc;
using Common.DTOs;
using Business.Handlers.Request;
using System;
using Business.Handlers.Handlers.contracts;
using Handlers.Exceptions;
using Business.Handlers.Response;

namespace Musical.Broccoli.API.Controllers
{
    [Route("api/[controller]")]
    public class UserController : Controller
    {
        private readonly IUserRequestHandler _requestHandler;

        public UserController(IUserRequestHandler requestHandler)
        {
            _requestHandler = requestHandler;
        }

        [HttpGet]
        public IActionResult Get([FromBody] Request<UserDTO> request)
        {
            
            Response<UserDTO> result;
            try
            {
                result = _requestHandler.HandleRequest(request);

            }
            catch (UnauthorizedAccessException)
            {
                return new UnauthorizedResult();
            }
            catch (InvalidRequestException)
            {
                return new BadRequestResult();
            }

            if (result.Data.Count <= 0)
            {
                return new NotFoundObjectResult(result);
            }
            return new OkObjectResult(result);
        }

        [HttpPost]
        public IActionResult Post([FromBody] Request<UserDTO> request)
        {
            Response<UserDTO> result;

            try
            {
                result = _requestHandler.HandleRequest(request);
            }
            catch (UnauthorizedAccessException)
            {
                return new UnauthorizedResult();
            }
            catch (InvalidRequestException)
            {
                return new BadRequestResult();
            }

            return new CreatedResult("", result);
        }

        [HttpPut]
        public IActionResult Put([FromBody] Request<UserDTO> request)
        {
            try
            {
                _requestHandler.HandleRequest(request);
            }
            catch (UnauthorizedAccessException)
            {
                return new UnauthorizedResult();
            }
            catch (InvalidRequestException)
            {
                return new BadRequestResult();
            }

            return new NoContentResult();
        }

        [HttpDelete]
        public IActionResult Delete([FromBody] Request<UserDTO> request)
        {
            try
            {
            }
            catch (UnauthorizedAccessException)
            {
                return new UnauthorizedResult();
            }
            catch (InvalidRequestException)
            {
                return new BadRequestResult();
            }

            return new NoContentResult();
        }
    }
}