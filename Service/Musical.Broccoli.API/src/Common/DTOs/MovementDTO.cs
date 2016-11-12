using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Common.DTOs
{
    public class MovementDTO
    {
        public int Id { get; set; }
        public int MovementsType { get; set; }
        public DateTime DateCreated { get; set; }
        public int TourId { get; set; }
        public int ReservationId { get; set; }

        public TourDTO Tour { get; set; }
        public ReservationDTO Reservation { get; set; }
    }
}
