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
    public class MovementConnector : BaseConnector<MovementDTO, Movement>
    {
        public MovementConnector(IMovementRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        public override ValidationResult Validate(MovementDTO dto)
        {
            throw new NotImplementedException();
        }
    }
}
