using Common.Enums;
using System.ComponentModel.DataAnnotations;

namespace DataAccessLayer.Entities
{
    public class Address : BaseEntity
    {
        public override int Id { get; set; }
        [Required]
        public string Name { get; set; }
        [Required]
        public string Street1 { get; set; }
        public string Street2 { get; set; }
        [Required]
        public string City { get; set; }
        [Required]
        public string State { get; set; }
        [Required]
        public int PostalCode { get; set; }
        [Required]
        public CountryCode CountryCode { get; set; }
    }
}
