using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Business.Connectors.Contracts;
using Common.DTOs;

namespace Business.Contracts
{
    public interface IMessageConnector:IBaseConnector<MessageDTO>
    {
    }
}
