using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Common.DTOs
{
    public class MessageDTO
    {

        public int Id { get; set; }
        public string Content { get; set; }
        public DateTime DateCreated { get; set; }
        public int SenderId { get; set; }

        public UserDTO Sender { get; set; }
        public ICollection<MessageHasRecieverDTO> MessageHasRecievers { get; set; }
    }
}
