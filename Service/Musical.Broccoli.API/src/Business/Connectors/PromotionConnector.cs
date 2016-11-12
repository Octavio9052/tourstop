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
    public class PromotionConnector : BaseConnector<PromotionDTO, Promotion>
    {
        public PromotionConnector(IPromotionRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }
    }
}
