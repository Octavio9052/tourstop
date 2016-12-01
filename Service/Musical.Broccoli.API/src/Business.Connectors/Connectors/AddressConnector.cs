using System.Linq;
using Common.DTOs;
using DataAccessLayer.Entities;
using AutoMapper;
using Business.Connectors.Contracts;
using DataAccessLayer.Repositories.Contracts;
using Business.Connectors.Petition;

namespace Business.Connectors
{
    public class AddressConnector : BaseConnector<AddressDTO, Address>, IAddressConnector
    {
        public AddressConnector(IAddressRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        #region Validate Methods

        protected override bool ValidateGet(ReadBusinessPetition petition)
        {
            return petition.RequestingUser != null;
        }

        protected override bool ValidateSave(ReadWriteBusinessPetition<AddressDTO> petition)
        {
            return petition.RequestingUser != null;
        }

        protected override bool ValidateDelete(ReadWriteBusinessPetition<AddressDTO> petition)
        {
            return petition.RequestingUser != null && petition.Data.All(x => x.Id == petition.RequestingUser.AddressId);
        }

        #endregion
    }
}