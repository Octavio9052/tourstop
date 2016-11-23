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
    public class TourController : BaseController<TourDTO>
    {
        public TourController( BaseRequestHandler<TourDTO> requestHandler ) : base( requestHandler )
        {
        }

        [HttpGet]
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

        [HttpPost]
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

        [HttpPut]
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

        [HttpDelete]
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