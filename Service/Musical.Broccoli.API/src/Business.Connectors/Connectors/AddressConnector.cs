using Business.Contracts;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Common.DTOs;
using DataAccessLayer.Repositories;
using Business.Helpers;
using DataAccessLayer.Entities;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Controllers.Petition;
using System.Security.Authentication;
using Business.Controllers.PetitionValidators;
using Business.Controllers.Response;

namespace Business.Connectors
{
    public class AddressConnector : BaseConnector<AddressDTO, Address>, IAddressConnector
    {
        public AddressConnector(IAddressRepository repository, IMapper mapper) : base(repository, mapper) { }

        protected override BusinessResponse<AddressDTO> Get(BusinessPetition<AddressDTO> petition)
        {
            if (!Validate(petition, new AddressGetValidation())) throw new AuthenticationException();
            return base.Get(petition);
        }
        protected override BusinessResponse<AddressDTO> Save(BusinessPetition<AddressDTO> petition)
        {
            if (!Validate(petition, new AddressSaveValidation())) throw new AuthenticationException();
            return base.Save(petition);
        }
        protected override BusinessResponse<AddressDTO> Delete(BusinessPetition<AddressDTO> petition)
        {
            if (!Validate(petition, new AddressDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Delete(petition);
        }
        protected override BusinessResponse<AddressDTO> Update(BusinessPetition<AddressDTO> petition)
        {
            if (!Validate(petition, new AddressDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Update(petition);
        }
    }

    internal sealed class AddressDeleteAndUpdateValidation : PetitionValidation<AddressDTO>
    {
        public override bool Validate(BusinessPetition<AddressDTO> petition)
        {
            return petition.RequestingUser != null && petition.Data.All(x=>x.Id==petition.RequestingUser.AddressId);
        }
    }
    internal sealed class AddressGetValidation : PetitionValidation<AddressDTO>
    {
        public override bool Validate(BusinessPetition<AddressDTO> petition)
        {
            return petition.RequestingUser != null;
        }
    }
    internal sealed class AddressSaveValidation : PetitionValidation<AddressDTO>
    {
        public override bool Validate(BusinessPetition<AddressDTO> petition)
        {
            return petition.RequestingUser != null;
        }
    }
}