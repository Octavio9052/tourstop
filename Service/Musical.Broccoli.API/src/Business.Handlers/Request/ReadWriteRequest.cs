﻿using System.Collections.Generic;
using Common.DTOs;

namespace Business.Handlers.Request
{
    public class ReadWriteRequest<T> : Request where T : BaseDTO
    {
        public List<T> Data { get; set; }
    }
}