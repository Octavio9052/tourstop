using Common.DTOs;

namespace Musical.Broccoli.API.Request
{
    public abstract class BaseRequest<TDto> where TDto : BaseDTO
    {
        public string AuthToken { get; set; }
    }
}