using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Validators
{
    public abstract class BaseValidator<TDto> where TDto : BaseDTO
    {
        public abstract Func<TDto,ValidationResult> Validate { get; internal set; }
    }
}
