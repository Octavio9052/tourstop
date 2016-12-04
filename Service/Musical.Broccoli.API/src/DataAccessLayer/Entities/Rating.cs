using System.ComponentModel.DataAnnotations;

namespace DataAccessLayer.Entities
{
    public class Rating : BaseEntity
    {
        public override int Id { get; set; }

        [Required]
        public int RatingValue { get; set; }

        public string Comment { get; set; }

        [Required]
        public int UserId { get; set; }

        [Required]
        public int TourId { get; set; }

        public User User { get; set; }
        public Tour Tour { get; set; }
    }
}