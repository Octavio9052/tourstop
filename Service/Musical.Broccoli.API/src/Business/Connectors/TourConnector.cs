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
    public class TourConnector : BaseConnector<TourDTO, Tour>
    {
        public TourConnector(ITourRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        public override ValidationResult Validate(TourDTO dto)
        {
            throw new NotImplementedException();
        }
    }
}
