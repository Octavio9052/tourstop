using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Handlers.Validation
{
    public class RatingValidator:BaseValidator<RatingDTO>
    {
        public override Func<RatingDTO, ValidationResult> Validate { get; internal set; }
        public RatingValidator And(RatingValidator other)
        {
            return new RatingValidator()
            {
                Validate = x => this.Validate( x ) + other.Validate( x )
            };
        }

        public static RatingValidator Holds( Predicate<RatingDTO> predicate, string message )
        {
            return new RatingValidator()
            {
                Validate = x => predicate.Invoke( x ) ? ValidationResult.Valid() : ValidationResult.Invalid( message )
            };
        }

        #region Validators
        public static RatingValidator TourIdIsValid()
        {
            return Holds(x => x.TourId == 0, "Invalid Tour");
        }
        public static RatingValidator RatingValueIsValid()
        {
            return Holds(x => x.RatingValue == 0, "Invalid RatingValue");
        }
        public static RatingValidator UserIdIsValid()
        {
            return Holds(x => x.UserId == 0, "Invalid User");
        }
        #endregion

        public static RatingValidator All()
        {
            return All(TourIdIsValid(), RatingValueIsValid(), UserIdIsValid());
        }
        public static RatingValidator All(params RatingValidator[] validators)
        {
            return validators.Aggregate((x, y) => x.And(y));
        }

    }
}
