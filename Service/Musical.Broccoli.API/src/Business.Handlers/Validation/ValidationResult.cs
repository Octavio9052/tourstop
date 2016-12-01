namespace Business.Handlers.Validation
{
    public class ValidationResult
    {
        public string Reason { get; set; }
        public bool IsValid { get; private set; }

        public static ValidationResult Valid()
        {
            return ValidationSupport.Valid();
        }

        public static ValidationResult Invalid(string reason)
        {
            return new Invalid(reason);
        }

        public static ValidationResult operator +(ValidationResult r1, ValidationResult r2)
        {
            return new ValidationResult()
            {
                Reason = string.Format(@"{0}, {1}", r1.Reason, r2.Reason),
                IsValid = r1.IsValid && r2.IsValid
            };
        }
    }

    internal sealed class Invalid : ValidationResult
    {
        public Invalid(string reason)
        {
            Reason = reason;
        }

        public new bool IsValid
        {
            get { return false; }
        }

        public new string Reason { get; set; }
    }

    internal sealed class Valid : ValidationResult
    {
        public new bool IsValid
        {
            get { return true; }
        }

        public new string Reason
        {
            get { return ""; }
            set { }
        }
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