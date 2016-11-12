namespace DataAccessLayer.Entities
{
    public class MessageHasReciever
    {
        public int Id { get; set; }
        public int MessageId { get; set; }
        public int RecieverId { get; set; }

        public Message Message { get; set; }
        public User Reciever { get; set; }
    }
}
