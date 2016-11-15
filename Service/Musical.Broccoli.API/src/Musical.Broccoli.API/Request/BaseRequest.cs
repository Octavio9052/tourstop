using Common.DTOs;
using System.Collections.Generic;

namespace Musical.Broccoli.API.Request
{
    public class BaseRequest<TDto> where TDto : BaseDTO
    {
        public string AuthToken { get; set; }
    }
}