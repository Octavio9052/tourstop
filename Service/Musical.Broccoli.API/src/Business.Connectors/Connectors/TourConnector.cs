﻿using System.Linq;
using AutoMapper;
using Business.Connectors.Contracts;
using Business.Connectors.Petition;
using Common.DTOs;
using Common.Enums;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;

namespace Business.Connectors
{
    public class TourConnector : BaseConnector<TourDTO, Tour>, ITourConnector
    {
        public TourConnector(ITourRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        #region Validate Methods

        protected override bool ValidateGet(ReadBusinessPetition petition)
        {
            return petition.RequestingUser != null;
        }

        protected override bool ValidateSave(ReadWriteBusinessPetition<TourDTO> petition)
        {
            return petition.RequestingUser.UserType == UserType.Promoter;
        }

        protected override bool ValidateDelete(ReadWriteBusinessPetition<TourDTO> petition)
        {
            return petition.Data.All(x => x.User.Id == petition.RequestingUser.Id);
        }

        #endregion
    }
}