using System;
using System.ComponentModel.DataAnnotations;
using Common.Enums;

namespace DataAccessLayer.Entities
{
    public class Movement : BaseEntity
    {
        public override int Id { get; set; }

        [Required]
        public MovementType MovementType { get; set; }

        [Required]
        public DateTime DateCreated { get; set; }

        [Required]
        public int OrderId { get; set; }

        [Required]
        public int ReservationId { get; set; }

        public Order Order { get; set; }
        public Reservation Reservation { get; set; }
    }
}