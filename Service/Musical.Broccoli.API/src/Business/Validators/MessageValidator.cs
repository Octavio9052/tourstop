using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Validators
{
    public class MessageValidator: BaseValidator<MessageDTO>
    {
        public override Func<MessageDTO, ValidationResult> Validate { get; internal set; }
        public static MessageValidator Holds(Predicate<MessageDTO> predicate, string message)
        {
            return new MessageValidator()
            {
                Validate = x => predicate.Invoke(x) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            };
        }
        public MessageValidator And(MessageValidator other)
        {
            return new MessageValidator()
            {
                Validate = x => {
                    ValidationResult result = Validate.Invoke(x);
                    return result.IsValid ? other.Validate.Invoke(x) : result;
                }
            };
        }
        public static MessageValidator ContentNotEmty()
        {
            return Holds(x => string.IsNullOrEmpty(x.Content) , "Content is null or empty");
        }
        public static MessageValidator UserisValid()
        {
            return Holds(x => x.SenderId == 0, "User is invalid");
        }
        public static MessageValidator All()
        {
            return All(ContentNotEmty(), UserisValid());
        }
        public static MessageValidator All(params MessageValidator[] validators)
        {

            var validatorsList = validators.ToList();

            return validatorsList.Aggregate((x, y) => x.And(y));

        }
    }
}
