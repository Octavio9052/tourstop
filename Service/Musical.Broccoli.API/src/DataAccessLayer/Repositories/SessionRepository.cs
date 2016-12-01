using System;
using System.Linq;
using DataAccessLayer.Context;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;

namespace DataAccessLayer.Repositories
{
    public class SessionRepository : BaseRepository<Session>, ISessionRepository
    {
        public SessionRepository(TourStopContext context) : base(context)
        {
        }

        public Session GetFullSession(int userId)
        {
            var session = GetbyKey(userId);

            Context.Entry(session).Reference(x => x.User).Load();

            return session;
        }

        public Session GetFullSession(Guid authToken)
        {
            var session = DbSet.First(x => x.AuthorizationToken.Equals(authToken));

            Context.Entry(session).Reference(x => x.User).Load();

            return session;
        }
    }
}