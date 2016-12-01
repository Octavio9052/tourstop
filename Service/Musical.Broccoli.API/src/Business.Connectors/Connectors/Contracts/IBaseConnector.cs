using System;
using Business.Connectors.Petition;
using Business.Connectors.Response;
using Common.DTOs;

namespace Business.Connectors.Contracts
{
    public interface IBaseConnector<T> where T : BaseDTO
    {
        Func<ReadBusinessPetition, BusinessResponse<T>> Get { get; }
        Func<ReadWriteBusinessPetition<T>, BusinessResponse<T>> Save { get; }
        Func<ReadWriteBusinessPetition<T>, BusinessResponse<T>> Delete { get; }
    }
}