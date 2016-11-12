using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Validators
{
    public class PromotionValidator:BaseValidator<PromotionDTO>
    {
        public override Func<PromotionDTO, ValidationResult> Validate { get; internal set; }
        public static PromotionValidator Holds(Predicate<PromotionDTO> predicate, string message)
        {
            return new PromotionValidator()
            {
                Validate = x => predicate.Invoke(x) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            };
        }
        public PromotionValidator And(PromotionValidator other)
        {
            return new PromotionValidator()
            {
                Validate = x => {
                    ValidationResult result = Validate.Invoke(x);
                    return result.IsValid ? other.Validate.Invoke(x) : result;
                }
            };
        }
        public static PromotionValidator PromoCodeNotEmpty()
        {
            return Holds(x => string.IsNullOrEmpty(x.PromoCode) , "PromoCode is null or empty");
        }
        public static PromotionValidator PromoTypeisValid()
        {
            return Holds(x => x.PromoType == 0, "Invalid PromoType");
        }
        public static PromotionValidator ValueisValid()
        {
            return Holds(x => x.Value == 0, "Invalid Value");
        }
        public static PromotionValidator All()
        {
            return All(PromoCodeNotEmpty(), PromoTypeisValid(), ValueisValid());
        }
        public static PromotionValidator All(params PromotionValidator[] validators)
        {

            var validatorsList = validators.ToList();
            return validatorsList.Aggregate((x, y) => x.And(y));

        }


    }
}
