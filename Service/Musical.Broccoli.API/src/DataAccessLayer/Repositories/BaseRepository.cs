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
        public BaseRepository()
        {
            this.Context = TourStopContextFactory.Create();
            this.DbSet = this.Context.Set<T>();
        }
        public void Add(T entity)
        {
            this.DbSet.Add(entity);
            this.Context.SaveChanges();
        }

        public ICollection<T> GetAll()
        {
            return DbSet.ToList();
        }

        public T GetbyKey(Func<T, bool> predicate)
        {
            return DbSet.FirstOrDefault(predicate);
        }

        public void Remove(T entity)
        {
            this.DbSet.Remove(entity);
            this.Context.SaveChanges();
           
        }

        public ICollection<T> Search(Func<T, bool> predicate)
        {
            return this.DbSet.Where(predicate).ToList();
        }

        public void Update(T entity)
        {
            var entryToUpdate = this.Context.Entry(entity);
            DbSet.Attach(entity);
            entryToUpdate.State = EntityState.Modified;
            this.Context.SaveChanges();
        }

        public IQueryable<T> GetQueryable()
        {
            return  DbSet;
        }
    }
}
