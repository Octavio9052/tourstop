using AutoMapper;
using Business.Contracts;
using Common.DTOs;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;
using System;
using System.Linq.Dynamic.Core;
using Business.Controllers.Petition;
using Business.Controllers.Response;

namespace Business.Connectors
{
    public abstract class BaseConnector<TDto, TEntity> : IBaseConnector<TDto>
        where TDto : BaseDTO where TEntity : BaseEntity
    {

        protected readonly IBaseRepository<TEntity> _repository;
        protected readonly IMapper _mapper;

        public BaseConnector( IBaseRepository<TEntity> repository, IMapper mapper )
        {
            _repository = repository;
            _mapper = mapper;
        }

        public BusinessResponse<TDto> Get( BusinessPetition petition )
        {
            throw new NotImplementedException();
        }

        public BusinessResponse<TDto> Save( DataBusinessPetition<TDto> petition )
        {
            throw new NotImplementedException();
        }

        public BusinessResponse<TDto> Update( DataBusinessPetition<TDto> petition )
        {
            throw new NotImplementedException();
        }

        public BusinessResponse<TDto> Delete( DataBusinessPetition<TDto> petition )
        {
            throw new NotImplementedException();
        }   

    }
}
