using System.Collections.Generic;
using Business.Connectors;
using Business.Controllers.Petition;
using Business.Controllers.Response;
using Common.DTOs;

namespace Business.Contracts
{
    public interface IBaseConnector<TDto> where TDto : BaseDTO
    {
        Dictionary<PetitionAction, BusinessPetitionProcessor<TDto>> Processors { get; }
    }
}
