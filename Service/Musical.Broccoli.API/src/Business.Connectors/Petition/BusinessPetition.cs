using System.Collections.Generic;
using Business.Controllers.Petition;
using Common.DTOs;

namespace Business.Connectors.Petition
{
    public class BusinessPetition<TDto> where TDto : BaseDTO
    {
        public PetitionAction Action { get; set; }
        public List<TDto> Data { get; set; }
        public string FilterString { get; set; }
        public UserDTO RequestingUser { get; set; }
    }
}