using DataAccessLayer.Context;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;

namespace DataAccessLayer.Repositories
{
    public class UserRepository : BaseRepository<User>, IUserRepository
    {
        public UserRepository(TourStopContext context) : base(context)
        {
        }
    }
}