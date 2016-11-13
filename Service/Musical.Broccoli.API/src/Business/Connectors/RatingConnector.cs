using Common.DTOs;
using DataAccessLayer.Entities;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Validators;
using System;
using Business.Contracts;

namespace Business.Connectors
{
    public class RatingConnector : BaseConnector<RatingDTO, Rating>, IRatingConnector
    {
        public RatingConnector(IRatingRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        public override ValidationResult Validate(RatingDTO dto)
        {
            throw new NotImplementedException();
        }
    }
}
