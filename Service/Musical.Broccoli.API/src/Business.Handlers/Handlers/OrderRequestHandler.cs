using Business.Connectors.Contracts;
using Business.Handlers.Authentication.contracts;
using Common.DTOs;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Validation;

namespace Business.Handlers.Handlers
{
    public class OrderRequestHandler : BaseRequestHandler<OrderDTO>, IOrderRequestHandler
    {
        public OrderRequestHandler(IBaseConnector<OrderDTO> connector, BaseValidator<OrderDTO> validator,
            IRequestAuthenticator authenticator) : base(connector, validator, authenticator)
        {
        }
    }
}