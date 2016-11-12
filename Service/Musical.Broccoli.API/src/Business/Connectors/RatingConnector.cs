using Common.DTOs;
using DataAccessLayer.Entities;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Validators;
using System;

namespace Business.Connectors
{
    public class RatingConnector : BaseConnector<RatingDTO, Rating>
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
