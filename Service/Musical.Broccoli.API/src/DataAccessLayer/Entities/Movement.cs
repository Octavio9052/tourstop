using System;
using Common.Enums;

namespace DataAccessLayer.Entities
{
    public class Movement : BaseEntity
    {
        public override int Id { get; set; }
        public MovementType MovementType { get; set; }
        public DateTime DateCreated { get; set; }
        public int OrderId { get; set; }
        public int ReservationId { get; set; }

        public Order Order { get; set; }
        public Reservation Reservation { get; set; }
    }
}
