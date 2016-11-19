using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Handlers.Request
{
    public class Filter
    {
        public string PropertyName { get; set; }
        public string Relatioship { get; set; }
        public string Value { get; set; }

        public string ExpressionString
        {
            get
            {
                return string.Format( @"{0}{1}{2}", PropertyName, Relatioship, Value );
            }
        }
    }
}
