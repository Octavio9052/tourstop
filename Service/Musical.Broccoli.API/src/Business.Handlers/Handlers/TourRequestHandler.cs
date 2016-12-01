using Business.Connectors.Contracts;
using Business.Handlers.Authentication.contracts;
using Common.DTOs;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Validation;

namespace Business.Handlers.Handlers
{
    public class TourRequestHandler : BaseRequestHandler<TourDTO>, ITourRequestHandler
    {
        public TourRequestHandler(IBaseConnector<TourDTO> connector, BaseValidator<TourDTO> validator,
            IRequestAuthenticator authenticator) : base(connector, validator, authenticator)
        {
        }
    }
}