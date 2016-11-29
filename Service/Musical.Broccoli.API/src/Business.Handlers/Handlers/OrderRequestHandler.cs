using Common.DTOs;
using System;
using Business.Contracts;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Response;
using Business.Handlers.Validation;

namespace Business.Handlers.Handlers
{
    public class OrderRequestHandler : BaseRequestHandler<OrderDTO>, IOrderRequestHandler
    {
        public OrderRequestHandler(IOrderConnector connector, OrderValidator validator) : base(connector, validator)
        {
        }
    }
}