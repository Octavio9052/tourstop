namespace DataAccessLayer.Entities
{
    public class Promotion
    {
        public int Id { get; set; }
        public float Value { get; set; }
        public string Description { get; set; }
        public int PromoType { get; set; }
        public string PromoCode { get; set; }
    }
}
