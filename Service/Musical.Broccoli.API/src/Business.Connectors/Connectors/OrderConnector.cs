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
using System.Security.Authentication;
using Business.Connectors.Petition;
using Business.Controllers.Response;

namespace Business.Connectors
{
    public class OrderConnector : BaseConnector<OrderDTO, Order>, IOrderConnector
    {
        public OrderConnector(IOrderRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }
        protected override BusinessResponse<OrderDTO> Get(BusinessPetition<OrderDTO> petition)
        {
            if (!Validate(petition, new OrderGetValidation())) throw new AuthenticationException();
            return base.Get(petition);
        }
        protected override BusinessResponse<OrderDTO> Save(BusinessPetition<OrderDTO> petition)
        {
            if (!Validate(petition, new OrderSaveValidation())) throw new AuthenticationException();
            return base.Save(petition);
        }
        protected override BusinessResponse<OrderDTO> Delete(BusinessPetition<OrderDTO> petition)
        {
            if (!Validate(petition, new OrderDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Delete(petition);
        }
        protected override BusinessResponse<OrderDTO> Update(BusinessPetition<OrderDTO> petition)
        {
            if (!Validate(petition, new OrderDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Update(petition);
        }
    }
    internal sealed class OrderDeleteAndUpdateValidation : PetitionValidation<OrderDTO>
    {
        public override bool Validate(BusinessPetition<OrderDTO> petition)
        {
            return petition.RequestingUser != null && petition.Data.All(x=>x.UserId==petition.RequestingUser.Id);
        }
    }
    internal sealed class OrderGetValidation : PetitionValidation<OrderDTO>
    {
        public override bool Validate(BusinessPetition<OrderDTO> petition)
        {
            return petition.RequestingUser != null;
        }
    }
    internal sealed class OrderSaveValidation : PetitionValidation<OrderDTO>
    {
        public override bool Validate(BusinessPetition<OrderDTO> petition)
        {
            return petition.RequestingUser != null;
        }
    }
}

