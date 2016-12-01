using DataAccessLayer.Context;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;

namespace DataAccessLayer.Repositories
{
    public class CheckPointRepository : BaseRepository<CheckPoint>, ICheckPointRepository
    {
        public CheckPointRepository(TourStopContext context) : base(context)
        {
        }
    }
}