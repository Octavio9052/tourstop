using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Validators
{
    public class MessageHasRecieverValidator : BaseValidator<MessageHasRecieverDTO>
    {
        public override Func<MessageHasRecieverDTO, ValidationResult> Validate { get; internal set; }
        public MessageHasRecieverValidator And(MessageHasRecieverValidator other)
        {
            return new MessageHasRecieverValidator()
            {
                Validate = x =>
                {
                    ValidationResult result = Validate.Invoke(x);
                    return result.IsValid ? other.Validate.Invoke(x) : result;
                }
            };
        }

        public static MessageHasRecieverValidator Holds(Predicate<MessageHasRecieverDTO> predicate, string message)
        {
            return new MessageHasRecieverValidator()
            {
                Validate = x => predicate.Invoke(x) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            };
        }
        public static MessageHasRecieverValidator MessageisValid()
        {
            return Holds(x => x.MessageId == 0, "Invalid Message");
        }
        public static MessageHasRecieverValidator UserisValid()
        {
            return Holds(x => x.RecieverId == 0, "Invalid User");
        }
        public static MessageHasRecieverValidator All()
        {
            return All(MessageisValid(), UserisValid());
        }
        public static MessageHasRecieverValidator All(params MessageHasRecieverValidator[] validators)
        {
            var validatorsList = validators.ToList();
            return validatorsList.Aggregate((x, y) => x.And(y));

        }

    }
}
