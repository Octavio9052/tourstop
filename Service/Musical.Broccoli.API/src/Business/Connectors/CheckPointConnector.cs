using Common.DTOs;
using DataAccessLayer.Entities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using DataAccessLayer.Repositories;
using Business.Validators;
using Business.Contracts;

namespace Business.Connectors
{
    public class CheckPointConnector : BaseConnector<CheckPointDTO, CheckPoint>, ICheckPointConnector
    {
        public CheckPointConnector(ICheckPointRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        public override ValidationResult Validate(CheckPointDTO dto)
        {
            throw new NotImplementedException();
        }
    }
}
