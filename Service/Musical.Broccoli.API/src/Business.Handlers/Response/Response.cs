using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Handlers.Response
{
    public class Response<TDto> where TDto : BaseDTO
    {
        public ICollection<TDto> Data { get; set; }
    }
}
