using Common.DTOs;
using System.Collections.Generic;

namespace Musical.Broccoli.API.Request
{
    public class BaseRequest<TDto> where TDto : BaseDTO
    {
        public ICollection<TDto> Data { get; set; }
        public ICollection<Filter> Filters { get; set; }
        public string AuthToken { get; set; }
    }
}