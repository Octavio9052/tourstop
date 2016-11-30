using System;
using System.Collections.Generic;
using System.Linq;
using Business.Handlers.Request;

namespace Business.Handlers.Validation.Request
{
    public class ReadRequestValidator : BaseValidator<ReadRequest>
    {
        public override Func<ReadRequest, ValidationResult> Validate
        {
            get { return x => ValidateFilters(x.Filters); }
            internal set { }
        }

        private static ValidationResult ValidateFilters(IReadOnlyCollection<Filter> filters)
        {
            return filters == null || filters.Count <= 0
                ? ValidationResult.Valid()
                : filters.Select(x => FilterValidator.All().Validate(x)).Aggregate((x, y) => x + y);
        }
    }
}