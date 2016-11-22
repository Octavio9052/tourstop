using Microsoft.AspNetCore.Mvc;
using Common.DTOs;
using Business.Handlers.Handlers;
using Business.Handlers.Request;
using System;
using Handlers.Exceptions;
using Business.Handlers.Response;

namespace Musical.Broccoli.API.Controllers
{
    [Route( "api/[controller]" )]
    public class UserController : BaseController<UserDTO>
    {
        public UserController( BaseRequestHandler<UserDTO> requestHandler ) : base( requestHandler )
        {
        }
        public override IActionResult Get( [FromBody] Request<UserDTO> request )
        {
            Response<UserDTO> result;
            try
            {
                result = _requestHandler.HandleRequest( request );
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
                return new NotFoundObjectResult( result );
            }
            return new OkObjectResult( result );
        }

        public override IActionResult Post( [FromBody] Request<UserDTO> request )
        {
            Response<UserDTO> result;

            try
            {
                result = _requestHandler.HandleRequest( request );
            }
            catch (UnauthorizedAccessException)
            {
                return new UnauthorizedResult();
            }
            catch (InvalidRequestException)
            {
                return new BadRequestResult();
            }

            return new CreatedResult( "", result );
        }

        public override IActionResult Put( [FromBody] Request<UserDTO> request )
        {
            Response<UserDTO> result;
            try
            {
                result = _requestHandler.HandleRequest( request );
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

        public override IActionResult Delete( [FromBody] Request<UserDTO> request )
        {
            Response<UserDTO> result;
            try
            {
                result = _requestHandler.HandleRequest( request );
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