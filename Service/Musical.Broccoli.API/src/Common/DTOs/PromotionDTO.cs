using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Common.Enums;

namespace Common.DTOs
{
    public class PromotionDTO
    {
        public int Id { get; set; }
        public float Value { get; set; }
        public string Description { get; set; }
        public PromoType PromoType { get; set; }
        public string PromoCode { get; set; }
    }
}
