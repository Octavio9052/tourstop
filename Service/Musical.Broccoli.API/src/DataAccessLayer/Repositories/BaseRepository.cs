using System;
using System.Collections.Generic;
using System.Linq;
using DataAccessLayer.Context;
using DataAccessLayer.Repositories.Contracts;
using Microsoft.EntityFrameworkCore;

namespace DataAccessLayer.Repositories
{
    public class BaseRepository<T> : IBaseRepository<T> where T : class
    {
        protected readonly TourStopContext Context;
        protected DbSet<T> DbSet;

        public BaseRepository(TourStopContext context)
        {
            Context = context;
            DbSet = Context.Set<T>();
        }

        public void Add(T entity)
        {
            DbSet.Add(entity);
            Context.SaveChanges();
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
            DbSet.Remove(entity);
            Context.SaveChanges();
        }

        public ICollection<T> Search(Func<T, bool> predicate)
        {
            return DbSet.Where(predicate).ToList();
        }

        public void Update(T entity)
        {
            var entryToUpdate = Context.Entry(entity);
            DbSet.Attach(entity);
            entryToUpdate.State = EntityState.Modified;
            Context.SaveChanges();
        }

        public IQueryable<T> GetQueryable()
        {
            return DbSet;
        }
    }
}