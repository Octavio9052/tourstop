using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Validators
{
    public class ValidationResult
    {
        public string Reason { get; set; }
        public bool IsValid { get; }
        public static ValidationResult Valid()
        {
            return ValidationSupport.Valid();
        }
        public static ValidationResult Invalid(string reason)
        {
            return new Invalid(reason);
        }
    }
    internal sealed class Invalid : ValidationResult
    {
        public Invalid(string reason)
        {
            Reason = reason;
        }
        public bool IsValid
        {
            get { return false; }
        }
        public string Reason { get; set; }
    }
    internal sealed class Valid : ValidationResult
    {
        public bool IsValid { get { return true; } }
        public string Reason { get { return ""; } set { } }
    }
    internal sealed class ValidationSupport
    {
        private static readonly ValidationResult valid = new Valid();
        internal static ValidationResult Valid()
        {
            return valid;
        }
    }
}