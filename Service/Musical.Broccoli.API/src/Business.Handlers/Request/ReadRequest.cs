using System.Collections.Generic;
using Common.DTOs;

namespace Business.Handlers.Request
{
    public class ReadRequest<T> : Request<T> where T : BaseDTO
    {
        public List<Filter> Filters { get; set; }
    }
}