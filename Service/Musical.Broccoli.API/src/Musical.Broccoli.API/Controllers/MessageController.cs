﻿using System;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Request;
using Business.Handlers.Response;
using Common.DTOs;
using Common.Exceptions;
using Microsoft.AspNetCore.Mvc;

namespace Musical.Broccoli.API.Controllers
{
    [Route("api/[controller]")]
    public class MessageController : Controller, IBaseController<MessageDTO>
    {
        private readonly IMessageRequestHandler _requestHandler;

        public MessageController(IMessageRequestHandler requestHandler)
        {
            _requestHandler = requestHandler;
        }

        [HttpGet]
        public IActionResult Get([FromBody] ReadRequest request)
        {
            Response<MessageDTO> result;
            try
            {
                result = _requestHandler.HandleReadRequest(request);
            }
            catch (AuthenticationException)
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
        public IActionResult Post([FromBody] ReadWriteRequest<MessageDTO> request)
        {
            Response<MessageDTO> result;

            try
            {
                result = _requestHandler.HandleReadWriteRequest(request);
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
        public IActionResult Put([FromBody] ReadWriteRequest<MessageDTO> request)
        {
            try
            {
                _requestHandler.HandleReadWriteRequest(request);
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
        public IActionResult Delete([FromBody] ReadWriteRequest<MessageDTO> request)
        {
            try
            {
                _requestHandler.HandleDeleteRequest(request);
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