using Business.Validators;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Handlers.Validators.RequestValidation
{
    public class RequestValidator : BaseValidator<Musical.Broccoli.API.Request.FilteredRequest>
    {
        public override Func<Musical.Broccoli.API.Request, ValidationResult> Validate
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
