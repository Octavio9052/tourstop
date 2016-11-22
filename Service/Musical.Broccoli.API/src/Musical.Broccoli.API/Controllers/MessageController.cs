using System;
using Business.Handlers.Handlers;
using Business.Handlers.Request;
using Business.Handlers.Response;
using Common.DTOs;
using Handlers.Exceptions;
using Microsoft.AspNetCore.Mvc;

namespace Musical.Broccoli.API.Controllers
{
    [Route( "api/[controller]" )]
    public class MessageController : BaseController<TourDTO>
    {
        public MessageController( BaseRequestHandler<TourDTO> requestHandler ) : base( requestHandler )
        {
        }

        public override IActionResult Get( [FromBody] Request<TourDTO> request )
        {
            Response<TourDTO> result;
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

        public override IActionResult Post( [FromBody] Request<TourDTO> request )
        {
            Response<TourDTO> result;

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

        public override IActionResult Put( [FromBody] Request<TourDTO> request )
        {
            Response<TourDTO> result;
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

        public override IActionResult Delete( [FromBody] Request<TourDTO> request )
        {
            Response<TourDTO> result;
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
