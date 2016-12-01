using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;
using DataAccessLayer.Context;

namespace DataAccessLayer.Repositories
{
    public class TourRepository : BaseRepository<Tour>, ITourRepository
    {
        public TourRepository(TourStopContext context) : base(context)
        {
        }
    }
}