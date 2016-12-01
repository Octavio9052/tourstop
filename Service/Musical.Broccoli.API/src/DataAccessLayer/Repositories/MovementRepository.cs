using DataAccessLayer.Context;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;

namespace DataAccessLayer.Repositories
{
    public class MovementRepository : BaseRepository<Movement>, IMovementRepository
    {
        public MovementRepository(TourStopContext context) : base(context)
        {
        }
    }
}