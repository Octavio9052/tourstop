using DataAccessLayer.Entities;
using DataAccessLayer.Repositories;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using DataAccessLayer.Factories;

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
                FirstName = "TestName_2",
                LastName = "LastName_2",
                Email = "test2@test.com",
                Phone = "64617850353",
                Password = "123456",
                LanguageCode = Common.Enums.LanguageCode.ES,
                UserType = Common.Enums.UserType.Promotor
            };
            var connectionString = @"server=localhost;userid=root;pwd=3585;port=3306;database=DBTourStop2;";
            Common.AppSettings.AppSettings.ConnectionString = connectionString;
            var userRepo = new UserRepository(TourStopContextFactory.Create());
            var users = new List<User>();
            //users.Add(user);
            userRepo.Add(users);
           var newusers = userRepo.GetAll();

            

            userRepo.Update(users);

            Console.WriteLine("Paso");
            Console.ReadLine();
        
            
        }
    }
}
