using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace DataAccessLayer.Repositories
{
    public class AddressRepository:BaseRepository<Address>, IAddressRepository
    {
        public AddressRepository():base()
        {

        }
    }
}
