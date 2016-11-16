using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Musical.Broccoli.API.Request
{
    public class FilteredRequest<TDto> : BaseRequest<TDto> where TDto : BaseDTO
    {

        public ICollection<Filter> Filters { get; set; }

    }
}
