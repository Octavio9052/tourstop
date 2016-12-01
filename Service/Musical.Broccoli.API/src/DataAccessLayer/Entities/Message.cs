using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;

namespace DataAccessLayer.Entities
{
    public class Message : BaseEntity
    {
        public override int Id { get; set; }

        [Required]
        public string Content { get; set; }

        [Required]
        public DateTime DateCreated { get; set; }

        [Required]
        public int SenderId { get; set; }

        public User Sender { get; set; }
        public ICollection<MessageHasReciever> MessageHasRecievers { get; set; }
    }
}