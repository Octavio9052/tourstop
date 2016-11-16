using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Validators
{
    public class MovementValidator:BaseValidator<MovementDTO>
    {
        public override Func<MovementDTO, ValidationResult> Validate { get; internal set; }
        public static MovementValidator Holds(Predicate<MovementDTO> predicate, string message)
        {
            return new MovementValidator()
            {
                Validate = x => predicate.Invoke(x) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            };
        }
        public MovementValidator And(MovementValidator other)
        {
            return new MovementValidator()
            {
                Validate = x => {
                    ValidationResult result = Validate.Invoke(x);
                    return result.IsValid ? other.Validate.Invoke(x) : result;
                }
            };
        }
        public static MovementValidator MovementTypeisValid()
        {
            return Holds(x => x.MovementType == 0, "Invalid MovementType");
        }
        public static MovementValidator ReservationIdisValid()
        {
            return Holds(x => x.ReservationId == 0, "Invalid Reservation");
        }
        public static MovementValidator TourIdisValid()
        {
            return Holds(x => x.TourId == 0, "Invalid Tour");
        }
        public static MovementValidator All()
        {
            return All(MovementTypeisValid(), ReservationIdisValid(), TourIdisValid());
        }
        public static MovementValidator All(params MovementValidator[] validators)
        {

            var validatorsList = validators.ToList();

            return validatorsList.Aggregate((x, y) => x.And(y));

        }

    }
}
