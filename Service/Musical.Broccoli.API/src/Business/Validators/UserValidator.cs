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

        public static UserValidator NameNotEmty()
        { 
               return Holds(x => string.IsNullOrEmpty(x.FirstName), "First Name is null or empty");
        }





}
}
