namespace Common.DTOs
{
    public class RatingDTO : BaseDTO
    {
        public override int Id { get; set; }
        public int RatingValue { get; set; }
        public string Comment { get; set; }
        public int UserId { get; set; }
        public int TourId { get; set; }

        public UserDTO User { get; set; }
        public TourDTO Tour { get; set; }
    }
}