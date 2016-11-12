namespace DataAccessLayer.Entities
{
    public class Message
    {
        public int Id { get; set; }
        public string Content { get; set; }
        public DateTime DateCreated { get; set; }
        public int SenderId { get; set; }
        public User Sender { get; set; }
        public ICollection<User> MessageHasRecievers { get; set; }
    }
}