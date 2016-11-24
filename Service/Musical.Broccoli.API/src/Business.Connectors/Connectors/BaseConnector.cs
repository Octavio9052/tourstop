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
using Business.Controllers.PetitionValidators;
using System.Security.Authentication;
using Business.Controllers.Exceptions;

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
            var businessResponse = new BusinessResponse<TDto>();
           try
            {
                var data = _repository.GetQueryable().Where(petition.FilterStrings.ToString());
                businessResponse.Data=_mapper.Map<List<TDto>>(data);
                businessResponse.IsSuccessful = true;
            }
            catch(Exception ex)
            {
                businessResponse.Exceptions = new List<Exception>();
                businessResponse.Exceptions.Add(new InternalServerException(ex.Message));
                businessResponse.IsSuccessful = false;
            }
            return businessResponse;
        }

        protected virtual BusinessResponse<TDto> Save( BusinessPetition<TDto> petition )
        {
            var businessResponse = new BusinessResponse<TDto>();
            try
            {
                var data = _mapper.Map<List<TEntity>>(petition.Data);
                _repository.Add(data);
                businessResponse.IsSuccessful = true;
            }
            catch (Exception ex)
            {
                businessResponse.Exceptions = new List<Exception>();
                businessResponse.Exceptions.Add(new InternalServerException(ex.Message));
                businessResponse.IsSuccessful = false;
            }
            return businessResponse;
        }

        protected virtual BusinessResponse<TDto> Update( BusinessPetition<TDto> petition )
        {
            var businessResponse = new BusinessResponse<TDto>();
            try
            {
                var data = _mapper.Map<List<TEntity>>(petition.Data);
                _repository.Update(data);
                businessResponse.IsSuccessful = true;
            }
            catch (Exception ex)
            {
                businessResponse.Exceptions = new List<Exception>();
                businessResponse.Exceptions.Add(new InternalServerException(ex.Message));
                businessResponse.IsSuccessful = false;
            }
            return businessResponse;
        }

        protected virtual BusinessResponse<TDto> Delete( BusinessPetition<TDto> petition )
        {
            var businessResponse = new BusinessResponse<TDto>();
            try
            {
                var data = _mapper.Map<List<TEntity>>(petition.Data);
                _repository.Remove(data);
                businessResponse.IsSuccessful = true;
            }
            catch (Exception ex)
            {
                businessResponse.Exceptions = new List<Exception>();
                businessResponse.Exceptions.Add(new InternalServerException(ex.Message));
                businessResponse.IsSuccessful = false;
            }
            return businessResponse;
        }
        #endregion

        #region Validation Methods
        protected bool Validate(BusinessPetition<TDto> petition, PetitionValidation<TDto> petitionValidation)
        {
            return petitionValidation.Validate(petition);
        }


        #endregion

    }

    public delegate BusinessResponse<TDto> BusinessPetitionProcessor<TDto>( BusinessPetition<TDto> petition ) where TDto : BaseDTO;
}
