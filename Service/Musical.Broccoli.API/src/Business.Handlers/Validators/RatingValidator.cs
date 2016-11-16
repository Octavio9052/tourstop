using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Validators
{
    public class RatingValidator:BaseValidator<RatingDTO>
    {
        public override Func<RatingDTO, ValidationResult> Validate { get; internal set; }
        public static RatingValidator Holds(Predicate<RatingDTO> predicate, string message)
        {
            return new RatingValidator()
            {
                Validate = x => predicate.Invoke(x) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            };
        }
        public RatingValidator And(RatingValidator other)
        {
            return new RatingValidator()
            {
                Validate = x => {
                    ValidationResult result = Validate.Invoke(x);
                    return result.IsValid ? other.Validate.Invoke(x) : result;
                }
            };
        }
        public static RatingValidator TourIdisValid()
        {
            return Holds(x => x.TourId == 0, "Invalid Tour");
        }
        public static RatingValidator RatingValueisValid()
        {
            return Holds(x => x.RatingValue == 0, "Invalid RatingValue");
        }
        public static RatingValidator UserIdisValid()
        {
            return Holds(x => x.UserId == 0, "Invalid User");
        }
        public static RatingValidator All()
        {
            return All(TourIdisValid(), RatingValueisValid(), UserIdisValid());
        }
        public static RatingValidator All(params RatingValidator[] validators)
        {

            var validatorsList = validators.ToList();

            return validatorsList.Aggregate((x, y) => x.And(y));

        }

    }
}
