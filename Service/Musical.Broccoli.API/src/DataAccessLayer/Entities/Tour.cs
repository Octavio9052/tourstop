using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;

namespace DataAccessLayer.Entities
{
    public class Tour : BaseEntity
    {
        public override int Id { get; set; }
        [Required]
        public string Title { get; set; }
        [Required]
        public int MaxReservation { get; set; }
        [Required]
        public float ReservationPrice { get; set; }
        [Required]
        public bool Status { get; set; }
        public DateTime DateModified { get; set; }
        [Required]
        public DateTime DateCreated { get; set; }
        public int PromotionId { get; set; }
        [Required]
        public int UserId { get; set; }

        public Promotion  Promotion { get; set; }
        public User User { get; set; }
        public ICollection<Reservation> Reservations { get; set; }
        public ICollection<Rating> Ratings { get; set; }

    }
}
