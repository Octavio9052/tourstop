using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Common.DTOs
{
    public class SessionDTO:BaseDTO
    {
        public int Id { get; set; }
        public string AuthorizationToken { get; set; }
        public int UserID { get; set; }
        public DateTime DateCreated { get; set; }

        public UserDTO User { get; set; }
    }
}
