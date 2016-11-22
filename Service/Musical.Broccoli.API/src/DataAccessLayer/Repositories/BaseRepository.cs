using DataAccessLayer.Context;
using DataAccessLayer.Factories;
using DataAccessLayer.Repositories.Contracts;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;


namespace DataAccessLayer.Repositories
{
    public class BaseRepository<T> : IBaseRepository<T> where T : class
    {
        protected readonly DbContext Context;
        protected DbSet<T> DbSet;
        public BaseRepository(TourStopContext context)
        {
            this.Context = context;
            this.DbSet = this.Context.Set<T>();
        }
        public void Add(ICollection<T> entities)
        {
            this.DbSet.AddRange(entities);
            this.Context.SaveChanges();
        }

        public ICollection<T> GetAll()
        {
            return this.Context.Set<T>().ToList();
        }

        public T GetbyKey(Func<T, bool> predicate)
        {
            return DbSet.FirstOrDefault(predicate);
        }

        public void Remove(ICollection<T> entities)
        {
            this.DbSet.RemoveRange(entities);
            this.Context.SaveChanges();
           
        }

        public ICollection<T> Search(Func<T, bool> predicate)
        {
            return this.DbSet.Where(predicate).ToList();
        }

        public void Update(ICollection<T> entities)
        {
 
                this.DbSet.UpdateRange(entities);
                this.Context.SaveChanges();
            
            
        }

        public IQueryable<T> GetQueryable()
        {
            return  DbSet;
        }
    }
}
