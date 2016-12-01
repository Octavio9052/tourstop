﻿using DataAccessLayer.Entities;
using DataAccessLayer.Repositories.Contracts;
using DataAccessLayer.Context;

namespace DataAccessLayer.Repositories
{
    public class OrderRepository : BaseRepository<Order>, IOrderRepository
    {
        public OrderRepository(TourStopContext context) : base(context)
        {
        }
    }
}