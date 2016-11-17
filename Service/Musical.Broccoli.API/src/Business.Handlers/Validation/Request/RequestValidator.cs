using Common.DTOs;
using System;
using Business.Handlers.Request;

namespace Business.Handlers.Validation.Request
{
    public class RequestValidato<TDto> : BaseValidator<FilteredRequest<TDto>> where TDto : BaseDTO
    {
        public override Func<FilteredRequest<TDto>, ValidationResult> Validate { get; internal set; }
    }
}
