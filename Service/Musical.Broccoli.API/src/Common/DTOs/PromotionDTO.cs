using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Common.DTOs
{
    public class PromotionDTO
    {
        public int Id { get; set; }
        public float Value { get; set; }
        public string Description { get; set; }
        public int PromoType { get; set; }
        public string PromoCode { get; set; }
    }
}
