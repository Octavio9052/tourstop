using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Musical.Broccoli.API.Request
{
    public class DataRequest<TDto> : FilteredRequest<TDto> where TDto : BaseDTO
    {
        public ICollection<TDto> Data { get; set; }
    }
}
