using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Validators
{
    public class PaymentInfoValidator:BaseValidator<PaymentInfoDTO>
    {
        public override Func<PaymentInfoDTO, ValidationResult> Validate { get; internal set; }
        public static PaymentInfoValidator Holds(Predicate<PaymentInfoDTO> predicate, string message)
        {
            return new PaymentInfoValidator()
            {
                Validate = x => predicate.Invoke(x) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            };
        }
        public PaymentInfoValidator And(PaymentInfoValidator other)
        {
            return new PaymentInfoValidator()
            {
                Validate = x => {
                    ValidationResult result = Validate.Invoke(x);
                    return result.IsValid ? other.Validate.Invoke(x) : result;
                }
            };
        }
        public static PaymentInfoValidator All()
        {
            return All();
        }
        public static PaymentInfoValidator All(params PaymentInfoValidator[] validators)
        {

            var validatorsList = validators.ToList();

            return validatorsList.Aggregate((x, y) => x.And(y));

        }
    }
}
