using System.Collections.Generic;
using Common.Enums;

namespace DataAccessLayer.Entities
{
    public class User
    {
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string Email { get; set; }
        public string Phone { get; set; }
        public LanguageCode LanguageCode { get; set; }
        public UserType UserType { get; set; }
        public int AddressId { get; set; }

        public Address Address { get; set; }
        public ICollection<Message> Messages { get; set; }
        public ICollection<MessageHasReciever> MessageHasRecievers { get; set; }
        public ICollection<Tour> Tours { get; set; }
        public ICollection<Order> Orders { get; set; }
        public ICollection<Rating> Ratings { get; set; }
        public ICollection<Reservation> Reservations { get; set; }
    }
}
