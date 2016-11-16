using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Handlers.Validation
{
    public class PromotionValidator:BaseValidator<PromotionDTO>
    {
        public override Func<PromotionDTO, ValidationResult> Validate { get; internal set; }
        public PromotionValidator And(PromotionValidator other)
        {
            return new PromotionValidator()
            {
                Validate = x => this.Validate( x ) + other.Validate( x )
            };
        }

        public static PromotionValidator Holds(Predicate<PromotionDTO> predicate, string message)
        {
            return new PromotionValidator()
            {
                Validate = x => predicate.Invoke(x) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            };
        }

        #region Validator
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
        #endregion
        
        public static PromotionValidator All()
        {
            return All(PromoCodeNotEmpty(), PromoTypeisValid(), ValueisValid());
        }
        public static PromotionValidator All(params PromotionValidator[] validators)
        {
            return validators.Aggregate((x, y) => x.And(y));
        }


    }
}
