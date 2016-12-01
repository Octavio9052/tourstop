using System;
using System.ComponentModel.DataAnnotations;

namespace DataAccessLayer.Entities
{
    public class CheckPoint : BaseEntity
    {
        public override int Id { get; set; }

        [Required]
        public DateTime StartTime { get; set; }

        public DateTime EndTime { get; set; }

        [Required]
        public int AddressId { get; set; }

        [Required]
        public int TourId { get; set; }

        public Address Address { get; set; }
        public Tour Tour { get; set; }
    }
}