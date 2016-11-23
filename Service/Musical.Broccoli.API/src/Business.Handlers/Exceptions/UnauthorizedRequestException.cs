using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Handlers.Exceptions
{
    public class UnauthorizedRequestException : Exception
    {
        public UnauthorizedRequestException( string message ) : base( message ) { }
    }
}
