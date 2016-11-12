using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Validators
{
    public class TourValidator : BaseValidator<TourDTO> {
        public override Func<TourDTO, ValidationResult> Validate { get; internal set; }

        public static TourValidator NameNotEmpty() {
            return Holds(tour => string.IsNullOrEmpty(tour.Title), "Title is null or empty");
        }

        public static TourValidator MaxReservationIsNotZeroOrLess() {
            return Holds(tour => tour.MaxReservation <= 0, "Max Reservation is zero or less");
        }
        
        public static TourValidator ReservationPriceIsNotNegative() {
            return Holds(tour => tour.ReservationPrice >= 0, "Reservation price is negative");
        }

        public static TourValidator All(params TourValidator[] tourValidators) {

            var validatorsList = tourValidators.ToList();

            return validatorsList.Aggregate((x,y) => x.And(y));

        }

        public static TourValidator All() {
            return All(NameNotEmpty(), MaxReservationIsNotZeroOrLess(), ReservationPriceIsNotNegative());
        }

        public static TourValidator Holds(Predicate<TourDTO> predicate, string message) {
            return new TourValidator() {
                Validate = tour => predicate.Invoke(tour) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            }; 
        }
 

        public TourValidator And(TourValidator other) {
            return new TourValidator() {
                Validate = tour => {
                    ValidationResult result = Validate.Invoke(tour);
                    return result.IsValid ? other.Validate.Invoke(tour) : result;
                }
            };
        }

    }
}
