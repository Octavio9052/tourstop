using System.Collections.Generic;
using Common.Enums;
using System.ComponentModel.DataAnnotations;

namespace DataAccessLayer.Entities
{
    public class User : BaseEntity
    {
        public override int Id { get; set; }

        [Required]
        public string FirstName { get; set; }

        [Required]
        public string LastName { get; set; }

        [Required]
        public string Email { get; set; }

        [Required]
        public string Password { get; set; }

        [Required]
        public string Phone { get; set; }

        [Required]
        public LanguageCode LanguageCode { get; set; }

        [Required]
        public UserType UserType { get; set; }

        [Required]
        public int AddressId { get; set; }

        public Address Address { get; set; }
        public ICollection<MessageHasReciever> Messages { get; set; }
        public ICollection<Tour> Tours { get; set; }
        public ICollection<Order> Orders { get; set; }
        public ICollection<Rating> Ratings { get; set; }
        public ICollection<Reservation> Reservations { get; set; }
    }
}