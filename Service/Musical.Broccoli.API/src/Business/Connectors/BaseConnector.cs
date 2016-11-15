using AutoMapper;
using Business.Contracts;
using Common.DTOs;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Business.Validators;

namespace Business.Connectors
{
    public abstract class BaseConnector<TDto, TEntity> : IBaseConnector<TDto>
        where TDto : BaseDTO where TEntity : BaseEntity
    {

        protected readonly IBaseRepository<TEntity> _repository;
        protected readonly IMapper _mapper;

        public BaseConnector(IBaseRepository<TEntity> repository, IMapper mapper)
        {
            _repository = repository;
            _mapper = mapper;
        }

        public ICollection<TDto> GetAll()
        {
            var dtos = _mapper.Map<List<TDto>>(_repository.GetAll());
            return dtos;
        }

        public TDto GetById(int id)
        {
            var dto = _repository.GetbyKey(x => x.Id == id);
            return _mapper.Map<TDto>(dto);
        }

        public TDto GetByKey(Func<TDto, bool> key)
        {
            var dbKey = _mapper.Map<Func<TEntity, bool>>(key);
            var result = _repository.GetbyKey(dbKey);
            return _mapper.Map<TDto>(result);
        }

        public void Remove(TDto dto)
        {
            var entity = _mapper.Map<TEntity>(dto);
            _repository.Remove(entity);
        }

        public void Save(TDto dto)
        {
            var entity = _mapper.Map<TEntity>(dto);
            _repository.Add(entity);
        }

        public ICollection<TDto> Search(List<Func<TDto, bool>> keys)
        {
            throw new NotImplementedException();
        }

        public void Update(TDto dto)
        {
            var entity = _mapper.Map<TEntity>(dto);
            _repository.Update(entity);
        }

        public abstract ValidationResult Validate(TDto dto);
    }
}
