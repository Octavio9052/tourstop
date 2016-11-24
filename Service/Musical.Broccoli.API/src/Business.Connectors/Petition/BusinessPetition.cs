using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Common.DTOs;

namespace Business.Controllers.Petition
{
    public class BusinessPetition<TDto> where TDto : BaseDTO
    {
        public PetitionAction Action { get; set; }
        public List<TDto> Data { get; set; }
        public List<string> FilterStrings { get; set; }
        public UserDTO RequestingUser { get; set; }
    }
}
