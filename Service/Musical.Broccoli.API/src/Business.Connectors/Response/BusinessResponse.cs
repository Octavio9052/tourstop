using System;
using System.Collections.Generic;
using Common.DTOs;

namespace Business.Controllers.Response
{
    public class BusinessResponse<TDto> where TDto : BaseDTO
    {
        public bool IsSuccessful { get; set; }
        public List<TDto> Data { get; set; }
        public List<Exception> Exceptions { get; set; }
    }
}
