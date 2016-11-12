using System;

namespace DataAccessLayer.Entities
{
    public class CheckPoint : BaseEntity
    {
        public override int Id { get; set; }
        public DateTime StartTime { get; set; }
        public DateTime EndTime { get; set; }
        public int AddressId { get; set; }
        public int TourId { get; set; }

        public Address Address { get; set; }
        public Tour Tour { get; set; }


    }
}
