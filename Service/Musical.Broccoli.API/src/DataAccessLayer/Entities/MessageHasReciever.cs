using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace DataAccessLayer.Entities
{
    public class MessageHasReciever
    {
        public int MessageId { get; set; }
        public int RecieverId { get; set; }

        public Message Message { get; set; }
        public User Reciever { get; set; }
    }
}
