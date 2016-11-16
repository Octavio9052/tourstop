using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Handlers.Validation
{
    public class ReservationValidator:BaseValidator<ReservationDTO>
    {
        public override Func<ReservationDTO, ValidationResult> Validate { get; internal set; }
        public ReservationValidator And(ReservationValidator other)
        {
            return new ReservationValidator()
            {
                Validate = x => this.Validate( x ) + other.Validate( x )
            };
        }

        public static ReservationValidator Holds(Predicate<ReservationDTO> predicate, string message)
        {
            return new ReservationValidator()
            {
                Validate = x => predicate.Invoke(x) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            };
        }

        #region Validator
        public static ReservationValidator UserIdIsValid()
        {
            return Holds(x => x.UserId == 0, "Invalid User");
        }
        public static ReservationValidator TourIdIsValid()
        {
            return Holds(x => x.TourId == 0, "Invalid Tour");
        }
        public static ReservationValidator OrderIdIsValid()
        {
            return Holds(x => x.OrderId == 0, "Invalid Order");
        }
        #endregion  

        public static ReservationValidator All()
        {
            return All(UserIdIsValid(), TourIdIsValid(), OrderIdIsValid());
        }
        public static ReservationValidator All(params ReservationValidator[] validators)
        {
            return validators.Aggregate((x, y) => x.And(y));
        }
    }
}
