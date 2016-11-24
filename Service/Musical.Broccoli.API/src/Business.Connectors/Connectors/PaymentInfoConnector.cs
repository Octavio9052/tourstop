using Common.DTOs;
using DataAccessLayer.Entities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Contracts;
using Business.Controllers.Petition;
using Business.Controllers.PetitionValidators;
using Business.Controllers.Response;
using System.Security.Authentication;

namespace Business.Connectors
{
    public class PaymentInfoConnector : BaseConnector<PaymentInfoDTO, PaymentInfo>, IPaymentInfoConnector
    {
        public PaymentInfoConnector(IPaymentInfoRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }
        protected override BusinessResponse<PaymentInfoDTO> Get(BusinessPetition<PaymentInfoDTO> petition)
        {
            if (!Validate(petition, new PaymentInfoGetValidation())) throw new AuthenticationException();
            return base.Get(petition);
        }
        protected override BusinessResponse<PaymentInfoDTO> Save(BusinessPetition<PaymentInfoDTO> petition)
        {
            if (!Validate(petition, new PaymentInfoSaveValidation())) throw new AuthenticationException();
            return base.Save(petition);
        }
        protected override BusinessResponse<PaymentInfoDTO> Delete(BusinessPetition<PaymentInfoDTO> petition)
        {
            if (!Validate(petition, new PaymentInfoDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Delete(petition);
        }
        protected override BusinessResponse<PaymentInfoDTO> Update(BusinessPetition<PaymentInfoDTO> petition)
        {
            if (!Validate(petition, new PaymentInfoDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Update(petition);
        }

    }
    internal sealed class PaymentInfoDeleteAndUpdateValidation : PetitionValidation<PaymentInfoDTO>
    {
        public override bool Validate(BusinessPetition<PaymentInfoDTO> petition)
        {
            return true;
        }
    }
    internal sealed class PaymentInfoGetValidation : PetitionValidation<PaymentInfoDTO>
    {
        public override bool Validate(BusinessPetition<PaymentInfoDTO> petition)
        {
            return petition.RequestingUser != null;
        }
    }
    internal sealed class PaymentInfoSaveValidation : PetitionValidation<PaymentInfoDTO>
    {
        public override bool Validate(BusinessPetition<PaymentInfoDTO> petition)
        {
            return true;
        }
    }
}
