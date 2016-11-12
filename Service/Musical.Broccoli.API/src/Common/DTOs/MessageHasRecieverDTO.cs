using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Common.DTOs
{
    public class MessageHasRecieverDTO : BaseDTO
    {
        public int MessageId { get; set; }
        public int RecieverId { get; set; }

        public MessageDTO Message { get; set; }
        public UserDTO Reciever { get; set; }
    }
}
