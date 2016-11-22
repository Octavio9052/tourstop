using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Business.Handlers.Validation;
using Common.DTOs;

namespace Handlers.Validation.Request
{
    public class RequestValidationResult
    {
        public ValidationResult ValidationResult { get; set; }
        public UserDTO UserDTO { get; set; }
    }
}
