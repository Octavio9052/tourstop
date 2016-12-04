using Common.DTOs;

namespace Business.Connectors.Petition
{
    public class BusinessPetition
    {
        public PetitionAction Action { get; set; }
        public UserDTO RequestingUser { get; set; }
    }
}