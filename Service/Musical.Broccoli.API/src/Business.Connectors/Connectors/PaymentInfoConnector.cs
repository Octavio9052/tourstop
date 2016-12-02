using System.Linq;
using AutoMapper;
using Business.Connectors.Contracts;
using Business.Connectors.Petition;
using Common.DTOs;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;

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
            return (petition.Data != null && petition.Data.All(x => x.UserId == petition.RequestingUser.Id));
        }

        protected override bool ValidateDelete(ReadWriteBusinessPetition<PaymentInfoDTO> petition)
        {
            return true; //TODO: Bro you have to think THIS SHIT IS NOT READY YET
        }

        #endregion
    }
}