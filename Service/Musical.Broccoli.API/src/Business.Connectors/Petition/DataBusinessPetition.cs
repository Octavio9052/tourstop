using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Common.DTOs;

namespace Business.Controllers.Petition
{
    public class DataBusinessPetition<TDto> :BusinessPetition where TDto:BaseDTO
    {
        public List<TDto> Data { get; set; }
    }
}
