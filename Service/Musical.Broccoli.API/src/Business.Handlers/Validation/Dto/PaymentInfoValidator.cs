using System;
using System.Linq;
using Common.DTOs;

namespace Business.Handlers.Validation.Dto
{
    public class PaymentInfoValidator : BaseValidator<PaymentInfoDTO>
    {
        public override Func<PaymentInfoDTO, ValidationResult> Validate { get; internal set; }

        public PaymentInfoValidator And(PaymentInfoValidator other)
        {
            return new PaymentInfoValidator
            {
                Validate = x => Validate(x) + other.Validate(x)
            };
        }

        public static PaymentInfoValidator Holds(Predicate<PaymentInfoDTO> predicate, string message)
        {
            return new PaymentInfoValidator
            {
                Validate = x => predicate.Invoke(x) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            };
        }

        public static PaymentInfoValidator All()
        {
            return All();
        }

        public static PaymentInfoValidator All(params PaymentInfoValidator[] validators)
        {
            var validatorsList = validators.ToList();
            return validators.Aggregate((x, y) => x.And(y));
        }
    }
}