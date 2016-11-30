using System.Collections.Generic;
using Common.DTOs;

namespace Business.Connectors.Petition
{
    public class ReadWriteBusinessPetition<T> : BusinessPetition where T : BaseDTO
    {
        public List<T> Data { get; set; }
    }
}