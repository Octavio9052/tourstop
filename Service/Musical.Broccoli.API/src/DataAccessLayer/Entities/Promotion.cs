using Common.Enums;
using System.ComponentModel.DataAnnotations;

namespace DataAccessLayer.Entities
{
    public class Promotion : BaseEntity
    {
        public override int Id { get; set; }
        [Required]
        public float Value { get; set; }
        [Required]
        public string Description { get; set; }
        [Required]
        public PromoType PromoType { get; set; }
        [Required]
        public string PromoCode { get; set; }
    }
}
