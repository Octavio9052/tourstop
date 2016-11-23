﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace DataAccessLayer.Repositories.Contracts
{
    public interface IBaseRepository<T>
    {
        T GetbyKey(Func<T,bool> predicate);
        ICollection<T> Search(Func<T,bool> predicate);
        ICollection<T> GetAll();
        IQueryable<T> GetQueryable();
        void Add(ICollection<T> entities);
        void Remove(ICollection<T> entities);
        void Update(ICollection<T> entities);

    }
}
