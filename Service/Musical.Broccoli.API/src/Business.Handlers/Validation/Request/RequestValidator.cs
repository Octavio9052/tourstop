using Common.DTOs;
using System;

namespace Business.Handlers.Validation.Request
{
    public class RequestValidato<TDto> : BaseValidator<Musical.Broccoli.API.Request.FilteredRequest<TDto>> where TDto : BaseDTO
    {
        public override Func<Musical.Broccoli.API.Request.FilteredRequest<TDto>, ValidationResult> Validate
        {
            get
            {
                throw new NotImplementedException();
            }

            internal set
            {
                throw new NotImplementedException();
            }
        }
    }
}
