using System;
using System.ComponentModel.DataAnnotations;

namespace DataAccessLayer.Entities
{
    public class Session : BaseEntity
    {
        public override int Id { get; set; }

        [Required]
        public Guid AuthorizationToken { get; set; }

        [Required]
        public int UserID { get; set; }

        [Required]
        public DateTime DateCreated { get; set; }

        public User User { get; set; }
    }
}