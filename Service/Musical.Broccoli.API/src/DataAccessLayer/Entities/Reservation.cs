using System;

namespace DataAccessLayer.Entities
{
    public class Reservation
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public DateTime DateCreated { get; set; }
        public bool Status { get; set; }
        public int UserId { get; set; }
        public int TourId { get; set; }
        public int OrderId { get; set; }

        public User User { get; set; }
        public Tour Tour { get; set; }
        public Order Order { get; set; }
    }
}
