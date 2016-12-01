namespace Business.Connectors.Exceptions
{
    public class InternalServerException : System.Exception
    {
        public InternalServerException(string message) : base(message)
        {
        }
    }
}