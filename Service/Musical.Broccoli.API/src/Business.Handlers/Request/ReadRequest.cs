using System.Collections.Generic;

namespace Business.Handlers.Request
{
    public class ReadRequest : Request
    {
        public List<Filter> Filters { get; set; }
    }
}