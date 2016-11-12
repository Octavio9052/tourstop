using Common.DTOs;
using DataAccessLayer.Entities;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;

namespace Business.Connectors
{
    public class RatingConnector : BaseConnector<RatingDTO, Rating>
    {
        public RatingConnector(IRatingRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }
    }
}
