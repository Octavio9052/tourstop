using System.Collections.Generic;
using Common.Enums;

namespace Common.DTOs
{
    public class UserDTO : BaseDTO
    {
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string Email { get; set; }
        public string Password { get; set; }
        public string Phone { get; set; }
        public LanguageCode LanguageCode { get; set; }
        public UserType UserType { get; set; }
        public int AddressId { get; set; }

        public AddressDTO Address { get; set; }
        public ICollection<MessageDTO> Messages { get; set; }
        public ICollection<TourDTO> Tours { get; set; }
        public ICollection<OrderDTO> Orders { get; set; }
        public ICollection<RatingDTO> Ratings { get; set; }
        public ICollection<ReservationDTO> Reservations { get; set; }
    }
}