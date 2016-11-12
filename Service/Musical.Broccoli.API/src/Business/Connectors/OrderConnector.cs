using Common.DTOs;
using DataAccessLayer.Entities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Validators;

namespace Business.Connectors
{
    public class OrderConnector : BaseConnector<OrderDTO, Order>
    {
        public OrderConnector(IOrderRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        public override ValidationResult Validate(OrderDTO dto)
        {
            throw new NotImplementedException();
        }
    }
}
