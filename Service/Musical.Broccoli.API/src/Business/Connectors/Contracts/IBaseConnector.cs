using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Business.Contracts
{
    public interface IBaseConnector<TDto>
    {
        TDto GetById(int id);
        ICollection<TDto> Search(List<Func<TDto, bool>> keys);
        TDto GetByKey(Func<TDto, bool> key);
        void Save(TDto dto);
        void Update(TDto dto);
        void Remove(TDto dto);
        ICollection<TDto> GetAll();
    }
}
