using DataAccessLayer.Entities;
using DataAccessLayer.Repositories;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Testing
{
    public class Program
    {
        public static void Main(string[] args)
        {
            User user = new User
            {
                Address = new Address
                {
                    Street1 = "#1",
                    City = "CityTest",
                    Name = "Test1",
                    PostalCode = 22502,
                    State = "BAJA",
                    CountryCode = Common.Enums.CountryCode.MX
                },
                FirstName = "TestName",
                LastName = "LastName",
                Email = "test@test.com",
                Password="123456",
                LanguageCode = Common.Enums.LanguageCode.ES,
                UserType = Common.Enums.UserType.Promotor
            };
            var connectionString = @"server=localhost;userid=root;pwd=3585;port=3306;database=DBTourStop;";
            Common.AppSettings.AppSettings.ConnectionString = connectionString;



            Console.WriteLine("Paso");
            Console.ReadLine();
        
            
        }
    }
}
