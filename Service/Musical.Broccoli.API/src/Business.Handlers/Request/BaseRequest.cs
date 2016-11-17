using Common.DTOs;

namespace Business.Handlers.Request
{
    public abstract class BaseRequest
    {
        public string AuthToken { get; set; }
    }
}