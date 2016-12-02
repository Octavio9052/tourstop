using System;
using System.Linq;
using Business.Handlers.Request;

namespace Business.Handlers.Validation.Request
{
    public class FilterValidator : BaseValidator<Filter>
    {
        public override Func<Filter, ValidationResult> Validate { get; internal set; }

        public FilterValidator And(FilterValidator other)
        {
            return new FilterValidator
            {
                Validate = x => Validate(x) + other.Validate(x)
            };
        }

        public static FilterValidator Holds(Predicate<Filter> predicate, string message)
        {
            return new FilterValidator()
            {
                Validate = x => predicate.Invoke(x) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            };
        }

        #region Validators

        public static FilterValidator PropertyNameIsNotNullOrEmpty()
        {
            return Holds(x => !string.IsNullOrEmpty(x.PropertyName), "Property Name is null or empty");
        }

        public static FilterValidator ValueIsNotNull()
        {
            return Holds(x => x.Value != null, "Value is null");
        }

        public static FilterValidator RelationshipIsNotNullOrEmpty()
        {
            return Holds(x => !string.IsNullOrEmpty(x.Relationship), "Relationship is not valid");
        }

        #endregion

        public static FilterValidator All(params FilterValidator[] validators)
        {
            return validators.Aggregate((x, y) => x.And(y));
        }

        public static FilterValidator All()
        {
            return All(PropertyNameIsNotNullOrEmpty(), RelationshipIsNotNullOrEmpty(), ValueIsNotNull());
        }
    }
}