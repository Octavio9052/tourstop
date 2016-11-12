using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Validators
{
    public class UserValidator:BaseValidator<UserDTO>
    {
        public override Func<UserDTO, ValidationResult> Validate { get; internal set; }
        public static UserValidator Holds(Predicate<UserDTO> predicate, string message)
        {
            return new UserValidator()
            {
                Validate = x => predicate.Invoke(x) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            };
        }
        public UserValidator And(UserValidator other)
        {
            return new UserValidator()
            {
                Validate = x => {
                    ValidationResult result = Validate.Invoke(x);
                    return result.IsValid ? other.Validate.Invoke(x) : result;
                }
            };
        }

        public static UserValidator NameNotEmty()
        { 
               return Holds(x => string.IsNullOrEmpty(x.FirstName) && string.IsNullOrEmpty(x.LastName), "Name is null or empty");
        }
        public static UserValidator EmailNotEmty()
        {
            return Holds(x => string.IsNullOrEmpty(x.Email), "Email is null or empty");
        }
        public static UserValidator EmailFormat()
        {
            return Holds(x => x.Email.Contains("@"), "Email invalid format");
        }
        public static UserValidator PhoneNotEmty()
        {
            return Holds(x => string.IsNullOrEmpty(x.Phone), "Phone is null or empty");
        }
        public static UserValidator LanguageCodeisValid()
        {
            return Holds(x => x.LanguageCode==0, "Invalid LanguageCode");
        }
        public static UserValidator UserTypeisValid()
        {
            return Holds(x => x.UserType == 0, "User is invalid");
        }
        public static UserValidator All()
        {
            return All(NameNotEmty(), EmailNotEmty(), EmailFormat(), PhoneNotEmty(), LanguageCodeisValid(), UserTypeisValid(), UserTypeisValid());
        }
        public static UserValidator All(params UserValidator[] validators)
        {

            var validatorsList = validators.ToList();

            return validatorsList.Aggregate((x, y) => x.And(y));

        }




    }
}
