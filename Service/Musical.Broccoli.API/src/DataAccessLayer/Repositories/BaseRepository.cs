﻿using System;
using System.Collections.Generic;
using System.Linq;
using DataAccessLayer.Context;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.ChangeTracking;

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

        public T GetbyKey(Func<T, bool> predicate)
        {
            return DbSet.FirstOrDefault(predicate);
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
            DbSet.Remove(entity);
        }

        public void SaveChanges()
        {
            Context.SaveChanges();
        }

        #endregion
    }
}