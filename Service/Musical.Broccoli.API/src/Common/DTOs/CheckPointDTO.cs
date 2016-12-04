using System;

namespace Common.DTOs
{
    public class CheckPointDTO : BaseDTO
    {
        public override int Id { get; set; }
        public DateTime StartTime { get; set; }
        public DateTime EndTime { get; set; }
        public int AddressId { get; set; }
        public int TourId { get; set; }

        public AddressDTO Address { get; set; }
        public TourDTO Tour { get; set; }
    }
}