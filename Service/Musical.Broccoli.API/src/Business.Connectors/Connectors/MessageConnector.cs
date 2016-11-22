using Common.DTOs;
using DataAccessLayer.Entities;
using System;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Contracts;
using Business.Controllers.Petition;

namespace Business.Connectors
{
    public class MessageConnector : BaseConnector<TourDTO, Message>, IMessageConnector
    {
        public MessageConnector(IMessageRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        protected override bool ValidatePetition( BusinessPetition<TourDTO> petition )
        {
            throw new NotImplementedException();
        }
    }
}
