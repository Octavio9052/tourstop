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


namespace Business.Connectors
{
    public class AddressConnector : BaseConnector<AddressDTO, Address>, IAddressConnector
    {
        public AddressConnector(IAddressRepository repository, IMapper mapper) : base(repository, mapper) { }
       
    }
}
