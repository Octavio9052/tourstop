using Common.DTOs;
using DataAccessLayer.Entities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Contracts;
using Business.Controllers.Petition;

namespace Business.Connectors
{
    public class OrderConnector : BaseConnector<OrderDTO, Order>, IOrderConnector
    {
        public OrderConnector(IOrderRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        protected override bool ValidatePetition( BusinessPetition<OrderDTO> petition )
        {
            throw new NotImplementedException();
        }
    }
}
