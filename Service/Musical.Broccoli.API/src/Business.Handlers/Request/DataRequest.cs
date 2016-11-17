using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Business.Controllers.Petition;

namespace Business.Handlers.Request
{
    public class DataRequest<TDto> : FilteredRequest<TDto> where TDto : BaseDTO
    {
        public List<TDto> Data { get; set; }

        public static explicit operator DataBusinessPetition<TDto>(DataRequest<TDto> request )
        {
            return new DataBusinessPetition<TDto>()
            {
                Data = request.Data,
                FilterStrings = request.Filters.Select( x => x.ExpressionString ).ToList()
            };
        }
    }
}
