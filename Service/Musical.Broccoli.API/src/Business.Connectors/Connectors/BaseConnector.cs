using AutoMapper;
using Common.DTOs;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;
using System;
using System.Linq.Dynamic.Core;
using Business.Controllers.Response;
using System.Collections.Generic;
using Business.Connectors.Contracts;
using Business.Connectors.Petition;
using Business.Controllers.Exceptions;

namespace Business.Connectors
{
    public abstract class BaseConnector<TDto, TEntity> : IBaseConnector<TDto>
        where TDto : BaseDTO where TEntity : BaseEntity
    {
        #region Instance Properties

        protected readonly IBaseRepository<TEntity> Repository;
        protected readonly IMapper Mapper;

        #endregion

        #region Processing Functions

        public Func<ReadBusinessPetition, BusinessResponse<TDto>> Get => ProcessGet;
        public Func<ReadWriteBusinessPetition<TDto>, BusinessResponse<TDto>> Save => ProcessSave;
        public Func<ReadWriteBusinessPetition<TDto>, BusinessResponse<TDto>> Delete => ProcessDelete;

        #endregion

        protected BaseConnector(IBaseRepository<TEntity> repository, IMapper mapper)
        {
            Repository = repository;
            Mapper = mapper;
        }

        #region Petition Processing

        private BusinessResponse<TDto> ProcessGet(ReadBusinessPetition petition)
        {
            Validate(petition, ValidateGet);
            var businessResponse = new BusinessResponse<TDto>();
            try
            {
                var data = Repository.GetQueryable().Where(petition.FilterString);
                businessResponse.Data = Mapper.Map<List<TDto>>(data);
                businessResponse.IsSuccessful = true;
            }
            catch (Exception ex)
            {
                businessResponse.Exceptions = new List<Exception> {new InternalServerException(ex.Message)};
                businessResponse.IsSuccessful = false;
            }
            return businessResponse;
        }

        private BusinessResponse<TDto> ProcessSave(ReadWriteBusinessPetition<TDto> petition)
        {
            var businessResponse = new BusinessResponse<TDto>();
            try
            {
                var data = Mapper.Map<List<TEntity>>(petition.Data);
                data.ForEach(x => Repository.AddOrUpdate(x));
                Repository.SaveChanges();
                businessResponse.IsSuccessful = true;
            }
            catch (Exception ex)
            {
                businessResponse.Exceptions = new List<Exception> {new InternalServerException(ex.Message)};
                businessResponse.IsSuccessful = false;
            }
            return businessResponse;
        }

        private BusinessResponse<TDto> ProcessDelete(ReadWriteBusinessPetition<TDto> petition)
        {
            var businessResponse = new BusinessResponse<TDto>();
            try
            {
                var data = Mapper.Map<List<TEntity>>(petition.Data);
                data.ForEach(x => Repository.Remove(x));
                Repository.SaveChanges();
                businessResponse.IsSuccessful = true;
            }
            catch (Exception ex)
            {
                businessResponse.Exceptions = new List<Exception> {new InternalServerException(ex.Message)};
                businessResponse.IsSuccessful = false;
            }
            return businessResponse;
        }

        #endregion

        #region Validation Methods

        private static bool Validate<T>(T petition, ValidatePetition<T> validator) where T : BusinessPetition
        {
            return validator.Invoke(petition);
        }

        protected abstract bool ValidateGet(ReadBusinessPetition petition);

        protected abstract bool ValidateSave(ReadWriteBusinessPetition<TDto> petition);

        protected abstract bool ValidateDelete(ReadWriteBusinessPetition<TDto> petition);

        #endregion

        public delegate bool ValidatePetition<in T>(T petition) where T : BusinessPetition;
    }
}