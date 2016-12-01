using DataAccessLayer.Context;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;

namespace DataAccessLayer.Repositories
{
    public class ReservationRepository : BaseRepository<Reservation>, IReservationRepository
    {
        public ReservationRepository(TourStopContext context) : base(context)
        {
        }
    }
}