using System;
using DataAccessLayer.Entities;

namespace DataAccessLayer.Repositories.Contracts
{
    public interface ISessionRepository : IBaseRepository<Session>
    {
        Session GetFullSession(int userId);

        Session GetFullSession(Guid authToken);
    }
}