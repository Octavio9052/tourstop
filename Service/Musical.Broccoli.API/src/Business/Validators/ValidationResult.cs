using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Validators
{
    public class ValidationResult
    {
        string reason;
        bool isValid;
        public ValidationResult(string reason)
        {
            this.reason = reason;
            this.isValid = false;
        }
        public ValidationResult()
        {
            this.reason = string.Empty;
            this.isValid=true;
        }
    }
}
