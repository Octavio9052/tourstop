using System;
using Business.Handlers.Handlers;
using Business.Handlers.Request;
using Business.Handlers.Response;
using Common.DTOs;
using Handlers.Exceptions;
using Microsoft.AspNetCore.Mvc;

namespace Musical.Broccoli.API.Controllers
{

    public class OrderController : BaseController<OrderDTO>
    {
        public OrderController( BaseRequestHandler<OrderDTO> requestHandler ) : base( requestHandler )
        {
        }


        [HttpGet]
        public override IActionResult Get( [FromBody] Request<OrderDTO> request )
        {
            Response<OrderDTO> result;
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
        public override IActionResult Post( [FromBody] Request<OrderDTO> request )
        {
            Response<OrderDTO> result;

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
        public override IActionResult Put( [FromBody] Request<OrderDTO> request )
        {
            Response<OrderDTO> result;
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
        public override IActionResult Delete( [FromBody] Request<OrderDTO> request )
        {
            Response<OrderDTO> result;
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
