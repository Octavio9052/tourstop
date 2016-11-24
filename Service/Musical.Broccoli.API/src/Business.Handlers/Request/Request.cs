using System.Collections.Generic;
using System.Linq;
using Business.Connectors.Petition;
using Business.Controllers.Petition;
using Common.DTOs;

namespace Business.Handlers.Request
{
    public class Request<TDto> where TDto : BaseDTO
    {
        public List<TDto> Data { get; set; }
        public List<Filter> Filters { get; set; }
        public string AuthToken { get; set; }

        public static explicit operator BusinessPetition<TDto>(Request<TDto> request)
        {
            return new BusinessPetition<TDto>
            {
                Data = request.Data,
                FilterString = request.Filters.Aggregate((x, y) => x + y).ExpressionString
            };
        }
    }
}