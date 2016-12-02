namespace Common.DTOs
{
    public class PaymentInfoDTO : BaseDTO
    {
        public override int Id { get; set; }
        public string CardNumber { get; set; }
        public int TypeOfCard { get; set; }
        public string CardHolderName { get; set; }
        public int ExpirationDate { get; set; }
        public int UserId { get; set; }

        public UserDTO User { get; set; }
    }
}