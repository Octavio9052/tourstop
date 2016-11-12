using System;
using System.Collections.Generic;

namespace DataAccessLayer.Entities
{
    public class Message : BaseEntity
    {
        public override int Id { get; set; }
        public string Content { get; set; }
        public DateTime DateCreated { get; set; }
        public int SenderId { get; set; }
        public User Sender { get; set; }
        public ICollection<MessageHasReciever> MessageHasRecievers { get; set; }
    }
}