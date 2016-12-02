using System;
using System.Linq;
using Common.DTOs;

namespace Business.Handlers.Validation.Dto
{
    public class MovementValidator : BaseValidator<MovementDTO>
    {
        public override Func<MovementDTO, ValidationResult> Validate { get; internal set; }

        public MovementValidator And(MovementValidator other)
        {
            return new MovementValidator
            {
                Validate = x => Validate(x) + other.Validate(x)
            };
        }

        public static MovementValidator Holds(Predicate<MovementDTO> predicate, string message)
        {
            return new MovementValidator
            {
                Validate = x => predicate.Invoke(x) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            };
        }

        #region Validators

        public static MovementValidator MovementTypeIsValid()
        {
            return Holds(x => x.MovementType == 0, "Invalid MovementType");
        }

        public static MovementValidator ReservationIdIsValid()
        {
            return Holds(x => x.ReservationId == 0, "Invalid Reservation");
        }

        public static MovementValidator OrderIdIsValid()
        {
            return Holds(x => x.OrderId == 0, "Invalid Order");
        }

        #endregion

        public static MovementValidator All()
        {
            return All(MovementTypeIsValid(), ReservationIdIsValid(), OrderIdIsValid());
        }

        public static MovementValidator All(params MovementValidator[] validators)
        {
            return validators.Aggregate((x, y) => x.And(y));
        }
    }
}