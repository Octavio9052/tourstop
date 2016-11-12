using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Common.Enums;

namespace Common.DTOs
{
    public class UserDTO
    {
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string Email { get; set; }
        public string Phone { get; set; }
        public LanguageCode LanguageCode { get; set; }
        public UserType UserType { get; set; }
        public int AddressId { get; set; }

        public AddressDTO Address { get; set; }
        public ICollection<MessageHasRecieverDTO> Messages { get; set; }
        public ICollection<TourDTO> Tours { get; set; }
        public ICollection<OrderDTO> Orders { get; set; }
        public ICollection<RatingDTO> Ratings { get; set; }
        public ICollection<ReservationDTO> Reservations { get; set; }
    }
}
