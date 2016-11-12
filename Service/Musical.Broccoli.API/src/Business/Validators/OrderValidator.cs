using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Validators
{
    public class OrderValidator : BaseValidator<OrderDTO>
    {
        public override Func<OrderDTO, ValidationResult> Validate { get; internal set; }
        public static OrderValidator Holds(Predicate<OrderDTO> predicate, string message)
        {
            return new OrderValidator()
            {
                Validate = x => predicate.Invoke(x) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            };
        }
        public OrderValidator And(OrderValidator other)
        {
            return new OrderValidator()
            {
                Validate = x =>
                {
                    ValidationResult result = Validate.Invoke(x);
                    return result.IsValid ? other.Validate.Invoke(x) : result;
                }
            };
        }
        public static OrderValidator UserisValid()
        {
            return Holds(x => x.UserId == 0, "Invalid User");
        }
        public static OrderValidator PaymentTypeisValid()
        {
            return Holds(x => x.PaymentType == 0, "Invalid PaymentType");
        }
        public static OrderValidator TotalAmountisValid()
        {
            return Holds(x => x.TotalAmount < 0, "Invalid TotalAmount");
        }
        public static OrderValidator ReservationsAreNotEmpty()
        {
            return Holds(x => x.Reservations.Count == 0, "Invalid TotalAmount");
        }
        public static OrderValidator All()
        {
            return All(UserisValid(), PaymentTypeisValid(), TotalAmountisValid(), ReservationsAreNotEmpty());
        }
        public static OrderValidator All(params OrderValidator[] validators)
        {

            var validatorsList = validators.ToList();

            return validatorsList.Aggregate((x, y) => x.And(y));

        }
    }
}
