using Common.DTOs;
using DataAccessLayer.Entities;
using System.Linq;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Contracts;
using Business.Connectors.Petition;

namespace Business.Connectors
{
    public class OrderConnector : BaseConnector<OrderDTO, Order>, IOrderConnector
    {
        public OrderConnector(IOrderRepository repository, IMapper mapper) : base(repository, mapper)
        {
        }

        #region Validate Methods

        protected override bool ValidateGet(ReadBusinessPetition petition)
        {
            return petition.RequestingUser != null; //TODO: Really only the owner user can see the Order THINK MY FRIEND
        }

        protected override bool ValidateSave(ReadWriteBusinessPetition<OrderDTO> petition)
        {
            return petition.RequestingUser != null;
        }

        protected override bool ValidateDelete(ReadWriteBusinessPetition<OrderDTO> petition)
        {
            return petition.RequestingUser != null && petition.Data.All(x => x.UserId == petition.RequestingUser.Id);
        }

        #endregion
    }
}