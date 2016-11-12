using Business.Contracts;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Common.DTOs;

namespace Business.Connectors
{
    public class AddressConnector : IAddressConnector {

        private readonly IAddressRepository _addressRepository;

        public ICollection<AddressDTO> getAll() {
            throw new NotImplementedException();
        }

        public AddressDTO getById(int id) {
            throw new NotImplementedException();
        }

        public AddressDTO getByKey(Func<AddressDTO, bool> key) {
            throw new NotImplementedException();
        }

        public void Remove(AddressDTO entity) {
            throw new NotImplementedException();
        }

        public void Save(AddressDTO entity) {
            throw new NotImplementedException();
        }

        public ICollection<AddressDTO> Search(List<Func<AddressDTO, bool>> keys) {
            throw new NotImplementedException();
        }

        public void Update(AddressDTO entity) {
            throw new NotImplementedException();
        }
    }
}
