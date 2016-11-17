using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Business.Controllers.Petition;

namespace Business.Handlers.Request
{
    public class FilteredRequest : BaseRequest
    {
        public List<Filter> Filters { get; set; }

        public static explicit operator BusinessPetition(FilteredRequest request )
        {
            return new BusinessPetition()
            {
                FilterStrings = request.Filters.Select( x => x.ExpressionString ).ToList();
            }
        }
    }
}
