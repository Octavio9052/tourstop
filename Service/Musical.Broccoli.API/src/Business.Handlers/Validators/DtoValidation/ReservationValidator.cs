using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Validators
{
    public class ReservationValidator:BaseValidator<ReservationDTO>
    {
        public override Func<ReservationDTO, ValidationResult> Validate { get; internal set; }
        public static ReservationValidator Holds(Predicate<ReservationDTO> predicate, string message)
        {
            return new ReservationValidator()
            {
                Validate = x => predicate.Invoke(x) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            };
        }
        public ReservationValidator And(ReservationValidator other)
        {
            return new ReservationValidator()
            {
                Validate = x => {
                    ValidationResult result = Validate.Invoke(x);
                    return result.IsValid ? other.Validate.Invoke(x) : result;
                }
            };
        }
        public static ReservationValidator UserIdisValid()
        {
            return Holds(x => x.UserId == 0, "Invalid User");
        }
        public static ReservationValidator TourIdisValid()
        {
            return Holds(x => x.TourId == 0, "Invalid Tour");
        }
        public static ReservationValidator OrderIdisValid()
        {
            return Holds(x => x.OrderId == 0, "Invalid Order");
        }
        public static ReservationValidator All()
        {
            return All(UserIdisValid(), TourIdisValid(), OrderIdisValid());
        }
        public static ReservationValidator All(params ReservationValidator[] validators)
        {

            var validatorsList = validators.ToList();

            return validatorsList.Aggregate((x, y) => x.And(y));

        }
    }
}
