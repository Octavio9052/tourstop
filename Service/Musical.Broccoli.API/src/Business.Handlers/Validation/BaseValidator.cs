using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Handlers.Validation
{
    public abstract class BaseValidator<T>
    {
        public abstract Func<T,ValidationResult> Validate { get; internal set; }

    }
}
