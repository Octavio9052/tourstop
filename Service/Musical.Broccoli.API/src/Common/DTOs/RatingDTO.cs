using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Common.DTOs
{
    public class RatingDTO
    {
        public int Id { get; set; }
        public int RatingValue { get; set; }
        public string Comment { get; set; }
        public int UserId { get; set; }
        public int TourId { get; set; }

        public UserDTO User { get; set; }
        public TourDTO Tour { get; set; }
    }
}
