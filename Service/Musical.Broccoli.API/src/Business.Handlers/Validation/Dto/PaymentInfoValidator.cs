﻿using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Handlers.Validation
{
    public class PaymentInfoValidator:BaseValidator<PaymentInfoDTO>
    {
        public override Func<PaymentInfoDTO, ValidationResult> Validate { get; internal set; }
        public PaymentInfoValidator And(PaymentInfoValidator other)
        {
            return new PaymentInfoValidator() {
                Validate = x => this.Validate(x) + other.Validate(x)
            };
        }

        public static PaymentInfoValidator Holds(Predicate<PaymentInfoDTO> predicate, string message)
        {
            return new PaymentInfoValidator()
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

            var validatorsList = validators.ToList(); return validators.Aggregate((x, y) => x.And(y));
        }
    }
}
