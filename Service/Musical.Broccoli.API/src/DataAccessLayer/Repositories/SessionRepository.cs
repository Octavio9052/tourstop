using DataAccessLayer.Context;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using DataAccessLayer.Context;
using Microsoft.EntityFrameworkCore;

namespace DataAccessLayer.Repositories
{
    public class SessionRepository: BaseRepository<Session>, ISessionRepository
    {
        public SessionRepository(TourStopContext context) : base(context)
        {
        }
    }
}
