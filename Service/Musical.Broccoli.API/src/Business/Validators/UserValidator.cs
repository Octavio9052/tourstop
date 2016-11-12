using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Validators
{
    public class UserValidator
    {
        private UserDTO user;
        public UserValidator( UserDTO user)
        {
            this.user = user;
        }
       // static ValidationResult nameisNotEmpty() { return  }

    }
}
