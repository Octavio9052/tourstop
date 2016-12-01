using System;
using System.ComponentModel.DataAnnotations;

namespace DataAccessLayer.Entities
{
    public class Reservation : BaseEntity
    {
        public override int Id { get; set; }

        [Required]
        public string Name { get; set; }

        [Required]
        public DateTime DateCreated { get; set; }

        [Required]
        public bool Status { get; set; }

        [Required]
        public int UserId { get; set; }

        [Required]
        public int TourId { get; set; }

        [Required]
        public int OrderId { get; set; }

        public User User { get; set; }
        public Tour Tour { get; set; }
        public Order Order { get; set; }
    }
}