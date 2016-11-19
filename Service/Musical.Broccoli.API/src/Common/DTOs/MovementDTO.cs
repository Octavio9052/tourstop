using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Common.Enums;

namespace Common.DTOs
{
    public class MovementDTO : BaseDTO
    {
        public int Id { get; set; }
        public MovementType MovementType { get; set; }
        public DateTime DateCreated { get; set; }
        public int OrderId { get; set; }
        public int ReservationId { get; set; }

        public OrderDTO Order { get; set; }
        public ReservationDTO Reservation { get; set; }
    }
}
