using System;

namespace Common.DTOs
{
    public class ReservationDTO : BaseDTO
    {
        public override int Id { get; set; }
        public string Name { get; set; }
        public DateTime DateCreated { get; set; }
        public bool Status { get; set; }
        public int UserId { get; set; }
        public int TourId { get; set; }
        public int OrderId { get; set; }

        public UserDTO User { get; set; }
        public TourDTO Tour { get; set; }
        public OrderDTO Order { get; set; }
    }
}