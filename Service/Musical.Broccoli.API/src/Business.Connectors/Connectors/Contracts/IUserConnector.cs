using Common.DTOs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Business.Connectors.Contracts;

namespace Business.Contracts
{
    public interface IUserConnector:IBaseConnector<UserDTO>
    {
    }
}
