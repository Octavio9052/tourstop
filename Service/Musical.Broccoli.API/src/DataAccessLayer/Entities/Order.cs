using System.Collections.Generic;
using Common.Enums;
using System;

namespace DataAccessLayer.Entities
{
    public class Order
    {
        public int Id { get; set; }
        public float TotalAmount { get; set; }
        public PaymentType PaymentType { get; set; }
        public bool PaymentStatus { get; set; }
        public int UserId { get; set; }
        public int PaymentId { get; set; }
        public DateTime DateCreated { get; set; }

        public User User { get; set; }
        public PaymentInfo Payment { get; set; }
        public ICollection<Reservation> Reservations { get; set; }
        public ICollection<Movement> Movements { get; set; }
    }
}
