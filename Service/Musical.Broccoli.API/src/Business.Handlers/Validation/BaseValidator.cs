using System;

namespace Business.Handlers.Validation
{
    public abstract class BaseValidator<T>
    {
        public abstract Func<T, ValidationResult> Validate { get; internal set; }
    }
}