using Business.Contracts;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Common.DTOs;
using DataAccessLayer.Repositories;
using Business.Helpers;
using DataAccessLayer.Entities;

namespace Business.Connectors
{
    public class AddressConnector : IAddressConnector
    {
        private AddressRepository addressRepository;
        public AddressConnector()
        {
            this.addressRepository = new AddressRepository();

        }
        public ICollection<AddressDTO> getAll()
        {
            var adrresDtos = AutoMapperFactory.Mapper.Map<List<AddressDTO>>(addressRepository.GetAll());
            return adrresDtos;
        }

        public AddressDTO getById(int id)
        {
            var address = addressRepository.GetbyKey(x => x.Id == id);
            return AutoMapperFactory.Mapper.Map<AddressDTO>(address);
        }

        public AddressDTO getByKey(Func<AddressDTO, bool> key)
        {
            var dbKey = AutoMapperFactory.Mapper.Map<Func<Address,bool>>(key);
            var address = addressRepository.GetbyKey(dbKey);
            return AutoMapperFactory.Mapper.Map<AddressDTO>(address);
        }

        public void Remove(AddressDTO entity)
        {
            var address = AutoMapperFactory.Mapper.Map<Address>(entity);
            addressRepository.Remove(address);
        }

        public void Save(AddressDTO entity)
        {
            var address = AutoMapperFactory.Mapper.Map<Address>(entity);
            addressRepository.Add(address);
        }

        public ICollection<AddressDTO> Search(List<Func<AddressDTO, bool>> keys)
        {
            throw new NotImplementedException();
        }

        public void Update(AddressDTO entity)
        {
            var address = AutoMapperFactory.Mapper.Map<Address>(entity);
            addressRepository.Remove(address);
        }
    }
}
