﻿using System.ComponentModel.DataAnnotations;

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