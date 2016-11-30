﻿using Common.DTOs;
using DataAccessLayer.Entities;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Contracts;
using Business.Connectors.Petition;

namespace Business.Connectors
{
    public class RatingConnector : BaseConnector<RatingDTO, Rating>, IRatingConnector
    {
        public RatingConnector(IRatingRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        #region Validate Methods

        protected override bool ValidateGet(ReadBusinessPetition petition)
        {
            return petition.RequestingUser != null;
        }

        protected override bool ValidateSave(ReadWriteBusinessPetition<RatingDTO> petition)
        {
            return true;
        }

        protected override bool ValidateDelete(ReadWriteBusinessPetition<RatingDTO> petition)
        {
            return true; //TODO: Think! Can ratings be deleted?
        }

        #endregion
    }
}