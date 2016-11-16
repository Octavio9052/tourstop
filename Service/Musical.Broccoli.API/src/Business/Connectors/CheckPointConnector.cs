using Common.DTOs;
using DataAccessLayer.Entities;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Contracts;

namespace Business.Connectors
{
    public class CheckPointConnector : BaseConnector<CheckPointDTO, CheckPoint>, ICheckPointConnector
    {
        public CheckPointConnector(ICheckPointRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

    }
}
