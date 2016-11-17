using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Business.Controllers.Petition;
using Business.Controllers.Response;
using Common.DTOs;

namespace Business.Contracts
{
    public interface IBaseConnector<TDto> where TDto : BaseDTO
    {
        public BusinessResponse<TDto> Get( BusinessPetition petition );

        public BusinessResponse<TDto> Save( DataBusinessPetition<TDto> petition );

        public BusinessResponse<TDto> Update( DataBusinessPetition<TDto> petition );

        public BusinessResponse<TDto> Delete( DataBusinessPetition<TDto> petition );
    }
}
