using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Common.DTOs
{
    public class OrderDTO
    {
        public int Id { get; set; }
        public float TotalAmount { get; set; }
        public int PaymentType { get; set; }
        public bool PaymentStatus { get; set; }
        public int UserId { get; set; }
        public int PaymentId { get; set; }

        public UserDTO User { get; set; }
        public PaymentInfoDTO Payment { get; set; }
        public ICollection<ReservationDTO> Reservations { get; set; }
        public ICollection<MovementDTO> Movements { get; set; }
    }
}
