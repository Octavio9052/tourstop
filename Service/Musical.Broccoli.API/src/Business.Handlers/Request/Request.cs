using Business.Connectors.Petition;

namespace Business.Handlers.Request
{
    public abstract class Request
    {
        public string AuthToken { get; set; }

        public static explicit operator BusinessPetition(Request request)
        {
            return new BusinessPetition();
        }
    }
}