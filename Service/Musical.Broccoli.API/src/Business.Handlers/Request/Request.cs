using System.Collections.Generic;
using System.Linq;
using Business.Connectors.Petition;
using Business.Controllers.Petition;
using Common.DTOs;

namespace Business.Handlers.Request
{
    public abstract class Request<T> where T : BaseDTO
    {
        public string AuthToken { get; set; }
    }
}