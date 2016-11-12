using Common.DTOs;
using DataAccessLayer.Entities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;

namespace Business.Connectors
{
    public class OrderConnector : BaseConnector<OrderDTO, Order>
    {
        public OrderConnector(IOrderRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }
    }
}
