using System;

namespace DataAccessLayer.Entities
{
    public class Movement
    {
        public int Id { get; set; }
        public int MovementsType { get; set; }
        public DateTime DateCreated { get; set; }
        public int TourId { get; set; }
        public int ReservationId { get; set; }

        public Tour Tour { get; set; }
        public Reservation Reservation { get; set; }
    }
}
