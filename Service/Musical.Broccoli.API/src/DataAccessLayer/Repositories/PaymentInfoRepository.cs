using DataAccessLayer.Context;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;

namespace DataAccessLayer.Repositories
{
    public class PaymentInfoRepository : BaseRepository<PaymentInfo>, IPaymentInfoRepository
    {
        public PaymentInfoRepository(TourStopContext context) : base(context)
        {
        }
    }
}