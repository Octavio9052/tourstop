using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace DataAccessLayer.Entities
{
    public class MessageHasReciever
    {
        [Required]
        public int MessageId { get; set; }
        [Required]
        public int RecieverId { get; set; }

        public Message Message { get; set; }
        public User Reciever { get; set; }
    }
}
