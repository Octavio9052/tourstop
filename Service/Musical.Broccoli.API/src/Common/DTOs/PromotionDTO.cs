using Common.Enums;

namespace Common.DTOs
{
    public class PromotionDTO : BaseDTO
    {
        public override int Id { get; set; }
        public float Value { get; set; }
        public string Description { get; set; }
        public PromoType PromoType { get; set; }
        public string PromoCode { get; set; }
    }
}