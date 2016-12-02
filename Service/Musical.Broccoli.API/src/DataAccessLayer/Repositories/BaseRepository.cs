using System;
using System.Collections.Generic;
using System.Linq;
using DataAccessLayer.Context;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;
using Microsoft.EntityFrameworkCore;

namespace DataAccessLayer.Repositories
{
    public class BaseRepository<T> : IBaseRepository<T> where T : BaseEntity
    {
        protected readonly TourStopContext Context;
        protected DbSet<T> DbSet;

        public BaseRepository(TourStopContext context)
        {
            Context = context;
            DbSet = Context.Set<T>();
        }

        #region Read

        public IQueryable<T> GetQueryable()
        {
            return DbSet;
        }

        public ICollection<T> GetAll()
        {
            return Context.Set<T>().ToList();
        }

        public T GetbyKey(object key)
        {
            return DbSet.Find(key);
        }

        public ICollection<T> Search(Func<T, bool> predicate)
        {
            return DbSet.Where(predicate).ToList();
        }

        #endregion

        #region Write

        public void AddOrUpdate(T entity)
        {
            Context.Entry(entity).State = entity.Id == 0 ? EntityState.Added : EntityState.Modified;
        }

        public void Remove(T entity)
        {
            Context.Entry(entity).State = EntityState.Deleted;
        }

        public void Remove(int id)
        {
            var entity = DbSet.Find(id);
            Context.Entry(entity).State = EntityState.Deleted;
        }

        public void SaveChanges()
        {
            Context.SaveChanges();
        }

        #endregion
    }
}