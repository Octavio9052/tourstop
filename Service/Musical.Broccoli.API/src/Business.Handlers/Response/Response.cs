using Common.DTOs;
using System.Collections.Generic;
using Business.Connectors.Response;

namespace Business.Handlers.Response
{
    public class Response<T> where T : BaseDTO
    {
        public ICollection<T> Data { get; set; }

        public static explicit operator Response<T>(BusinessResponse<T> businessResponse)
        {
            return new Response<T>
            {
                Data = businessResponse.Data
            };
        }
    }
}