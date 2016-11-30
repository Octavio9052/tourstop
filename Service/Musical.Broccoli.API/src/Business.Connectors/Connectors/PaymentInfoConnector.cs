﻿using Common.DTOs;
using DataAccessLayer.Entities;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Contracts;
using Business.Connectors.Petition;

namespace Business.Connectors
{
    public class PaymentInfoConnector : BaseConnector<PaymentInfoDTO, PaymentInfo>, IPaymentInfoConnector
    {
        public PaymentInfoConnector(IPaymentInfoRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        #region Validate Methods

        protected override bool ValidateGet(ReadBusinessPetition petition)
        {
            return petition.RequestingUser != null;
        }

        protected override bool ValidateSave(ReadWriteBusinessPetition<PaymentInfoDTO> petition)
        {
            return true;
        }

        protected override bool ValidateDelete(ReadWriteBusinessPetition<PaymentInfoDTO> petition)
        {
            return true; //TODO: Bro you have to think
        }

        #endregion
    }
}