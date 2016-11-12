namespace DataAccessLayer.Entities
{
    public class Rating
    {
        public int Id { get; set; }
        public int RatingValue { get; set; }
        public string Comment { get; set; }
        public int UserId { get; set; }
        public int TourId { get; set; }

        public User User { get; set; }
        public Tour Tour { get; set; }
    }
}
