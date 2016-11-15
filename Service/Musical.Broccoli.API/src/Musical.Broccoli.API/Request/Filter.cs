using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Musical.Broccoli.API.Request
{
    public class Filter
    {
        public string PropertyName { get; set; }
        public string Relatioship { get; set; }
        public string Value { get; set; }
    }
}
