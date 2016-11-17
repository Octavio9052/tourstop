using AutoMapper;
using Business.Contracts;
using Common.DTOs;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;
using System;
using System.Linq.Dynamic.Core;
using Business.Controllers.Petition;
using Business.Controllers.Response;
using DataAccessLayer.Repositories;
using System.Collections.Generic;

namespace Business.Connectors
{
    public abstract class BaseConnector<TDto, TEntity> : IBaseConnector<TDto>
        where TDto : BaseDTO where TEntity : BaseEntity
    {

        public Dictionary<PetitionAction,BusinessPetitionProcessor<TDto>> Processors { get; protected set; }

        #region Instance Properties
        protected readonly IBaseRepository<TEntity> _repository;
        protected readonly IMapper _mapper;
        #endregion

        public BaseConnector( IBaseRepository<TEntity> repository, IMapper mapper )
        {
            _repository = repository;
            _mapper = mapper;

            RegisterProcessors();
        }

        protected virtual void RegisterProcessors()
        {
            if(Processors == null)
            {
                Processors = new Dictionary<PetitionAction, BusinessPetitionProcessor<TDto>>();
            }
            Processors.Add( PetitionAction.Get, Get );
            Processors.Add( PetitionAction.Save, Save );
            Processors.Add( PetitionAction.Update, Update );
            Processors.Add( PetitionAction.Delete, Delete );
        }

        #region Petition Processing
        protected virtual BusinessResponse<TDto> Get( BusinessPetition<TDto> petition )
        {
            throw new NotImplementedException();
        }

        protected virtual BusinessResponse<TDto> Save( BusinessPetition<TDto> petition )
        {
            throw new NotImplementedException();
        }

        protected virtual BusinessResponse<TDto> Update( BusinessPetition<TDto> petition )
        {
            throw new NotImplementedException();
        }

        protected virtual BusinessResponse<TDto> Delete( BusinessPetition<TDto> petition )
        {
            throw new NotImplementedException();
        }
        #endregion

        #region Validation Methods
        protected abstract bool ValidatePetition( BusinessPetition<TDto> petition );

        #endregion

    }

    public delegate BusinessResponse<TDto> BusinessPetitionProcessor<TDto>( BusinessPetition<TDto> petition ) where TDto : BaseDTO;
}
