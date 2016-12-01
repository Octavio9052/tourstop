using System.Collections.Generic;
using Common.Enums;
using System;
using System.ComponentModel.DataAnnotations;

namespace DataAccessLayer.Entities
{
    public class Order : BaseEntity
    {
        public override int Id { get; set; }

        [Required]
        public float TotalAmount { get; set; }

        [Required]
        public PaymentType PaymentType { get; set; }

        [Required]
        public bool PaymentStatus { get; set; }

        [Required]
        public int UserId { get; set; }

        public int PaymentId { get; set; }

        [Required]
        public DateTime DateCreated { get; set; }

        public User User { get; set; }
        public PaymentInfo Payment { get; set; }
        public ICollection<Reservation> Reservations { get; set; }
        public ICollection<Movement> Movements { get; set; }
    }
}