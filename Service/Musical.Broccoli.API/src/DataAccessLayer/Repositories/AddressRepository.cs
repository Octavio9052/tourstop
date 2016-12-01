using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;
using DataAccessLayer.Context;

namespace DataAccessLayer.Repositories
{
    public class AddressRepository : BaseRepository<Address>, IAddressRepository
    {
        public AddressRepository(TourStopContext context) : base(context)
        {
        }
    }
}