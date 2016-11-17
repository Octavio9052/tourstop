using Common.DTOs;
using DataAccessLayer.Entities;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Contracts;
using Business.Controllers.Petition;
using System;

namespace Business.Connectors
{
    public class MovementConnector : BaseConnector<MovementDTO, Movement>, IMovementConnector
    {
        public MovementConnector(IMovementRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        protected override bool ValidatePetition( BusinessPetition<MovementDTO> petition )
        {
            throw new NotImplementedException();
        }
    }
}
