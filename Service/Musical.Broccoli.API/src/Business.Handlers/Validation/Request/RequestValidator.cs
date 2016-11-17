using Common.DTOs;
using System;
using Business.Handlers.Request;

namespace Business.Handlers.Validation.Request
{
    public class RequestValidato<TDto> : BaseValidator<FilteredRequest>
    {
        public override Func<FilteredRequest, ValidationResult> Validate { get; internal set; }
    }
}
