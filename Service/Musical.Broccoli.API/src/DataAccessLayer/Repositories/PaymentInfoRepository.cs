using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace DataAccessLayer.Repositories
{
    public class PaymentInfoRepository : BaseRepository<PaymentInfo>, IPaymentInfoRepository 
    {
        public PaymentInfoRepository() : base()
        {

        }
    }
}
