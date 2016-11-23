using Business.Controllers.Petition;
using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Controllers.PetitionValidators
{
    public abstract class PetitionValidation<TDto> where TDto: BaseDTO
    {
        public abstract bool Validate(BusinessPetition<TDto> petition);
    }
}
