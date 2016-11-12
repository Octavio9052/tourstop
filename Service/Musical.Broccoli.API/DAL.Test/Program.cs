using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Common.AppSettings;
using DataAccessLayer.Repositories;
using DataAccessLayer.Factories;
using DataAccessLayer.Entities;
using Common.Enums;

namespace DAL.Test
{
    public class Program
    {
        public static void Main(string[] args)
        {
            AppSettings.ConnectionString = @"Server=localhost;Database=myDataBase;Uid=root;Pwd=3585;";
            var userConnector = new UserRepository();
            var user = new User
            {
                FirstName = "Alejandro",
                LastName = "Cruz",
                Email = "test@test.com",
                UserType = UserType.User,
                Phone = "6461743953",
                LanguageCode = LanguageCode.EN,
                Address = new Address
                {
                    Name = "Ejemplo",
                    City = "La verga",
                    State = "SA",
                    CountryCode = CountryCode.MX,
                    Street1 = "Hola"
                }
            };
            userConnector.Add(user);
            var user1 = userConnector.GetbyKey(x => x.LastName=="Cruz");
            userConnector.Remove(user1);
            Console.WriteLine("Paso");
            Console.ReadLine();
            
        }
    }
}
