using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Handlers.Validation
{
    public class CheckPointValidator : BaseValidator<CheckPointDTO>
    {
        public override Func<CheckPointDTO, ValidationResult> Validate { get; internal set; }
        public CheckPointValidator And(CheckPointValidator other)
        {
            return new CheckPointValidator()
            {
                Validate = x => this.Validate( x ) + other.Validate( x )
            };
        }

        public static CheckPointValidator Holds(Predicate<CheckPointDTO> predicate, string message)
        {
            return new CheckPointValidator()
            {
                Validate = x => predicate.Invoke(x) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            };
        }

        #region Validators
        public static CheckPointValidator AddressIdIsValid()
        {
            return Holds(x => x.AddressId == 0, "Invalid Address");
        }
        public static CheckPointValidator TourIdIsValid()
        {
            return Holds(x => x.TourId == 0, "Invalid Tour");
        }
        #endregion

        public static CheckPointValidator All()
        {
            return All(AddressIdIsValid(), TourIdIsValid());
        }
        public static CheckPointValidator All(params CheckPointValidator[] validators)
        {
            return validators.Aggregate((x, y) => x.And(y));
        }
    }
}
