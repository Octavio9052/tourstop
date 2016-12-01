using System;
using System.Collections.Generic;

namespace Common.DTOs
{
    public class MessageDTO : BaseDTO
    {
        public int Id { get; set; }
        public string Content { get; set; }
        public DateTime DateCreated { get; set; }
        public int SenderId { get; set; }

        public UserDTO Sender { get; set; }
        public ICollection<UserDTO> Receivers { get; set; }
    }
}