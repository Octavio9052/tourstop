using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace DataAccessLayer.Entities
{
    public class Session:BaseEntity
    {
        public override int Id { get; set; }
        [Required]
        public string AuthorizationToken { get; set; }
        [Required]
        public int UserID { get; set; }
        [Required]
        public DateTime DateCreated { get; set; }

        public User User { get; set; }
    }
}
