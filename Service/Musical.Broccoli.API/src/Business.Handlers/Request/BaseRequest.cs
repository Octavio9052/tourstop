using Common.DTOs;

namespace Business.Handlers.Request
{
    public abstract class BaseRequest<TDto> where TDto : BaseDTO
    {
        public string AuthToken { get; set; }
    }
}