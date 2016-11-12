using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Validators
{
    public class CheckPointValidator : BaseValidator<CheckPointDTO>
    {
        public override Func<CheckPointDTO, ValidationResult> Validate { get; internal set; }
        public static CheckPointValidator Holds(Predicate<CheckPointDTO> predicate, string message)
        {
            return new CheckPointValidator()
            {
                Validate = x => predicate.Invoke(x) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            };
        }
        public CheckPointValidator And(CheckPointValidator other)
        {
            return new CheckPointValidator()
            {
                Validate = x => {
                    ValidationResult result = Validate.Invoke(x);
                    return result.IsValid ? other.Validate.Invoke(x) : result;
                }
            };
        }
        public static CheckPointValidator AddressIdisValid()
        {
            return Holds(x => x.AddressId == 0, "Invalid Address");
        }
        public static CheckPointValidator TourIdisValid()
        {
            return Holds(x => x.TourId == 0, "Invalid Tour");
        }
        public static CheckPointValidator All()
        {
            return All(AddressIdisValid(), TourIdisValid());
        }
        public static CheckPointValidator All(params CheckPointValidator[] validators)
        {

            var validatorsList = validators.ToList();

            return validatorsList.Aggregate((x, y) => x.And(y));

        }

    }
}
