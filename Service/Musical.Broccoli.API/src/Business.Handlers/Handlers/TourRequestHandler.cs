using Business.Contracts;
using Common.DTOs;
using System;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Response;
using Business.Handlers.Validation;

namespace Business.Handlers.Handlers
{
    public class TourRequestHandler : BaseRequestHandler<TourDTO>, ITourRequestHandler
    {
        public TourRequestHandler(ITourConnector connector, TourValidator validator) : base(connector, validator)
        {
        }
    }
}