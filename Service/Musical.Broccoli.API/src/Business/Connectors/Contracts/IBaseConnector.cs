using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Contracts
{
    public interface IBaseConnector<T>
    {
        T getById(int id);
        ICollection<T> Search(List<Func<T, bool>> keys);
        T getByKey(Func<T, bool> key);
        void Save(T entity);
        void Update(T entity);
        void Remove(T entity);
        ICollection<T> getAll();
    }
}
