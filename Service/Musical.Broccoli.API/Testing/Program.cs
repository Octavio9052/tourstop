using DataAccessLayer.Entities;
using DataAccessLayer.Repositories;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using DataAccessLayer.Factories;
using DataAccessLayer.Context;
using Microsoft.EntityFrameworkCore;
using Common.AppSettings;
using MySQL.Data.EntityFrameworkCore.Extensions;
//using MySQL.Data.EntityFrameworkCore.Extensions;

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
                FirstName = "TestName1",
                LastName = "LastName2",
                Email = "test_unitesting@test.com",
                Phone = "64617850353",
                Password = "123456",
                LanguageCode = Common.Enums.LanguageCode.ES,
                UserType = Common.Enums.UserType.Promotor
            };
            var connectionString = @"server=localhost;userid=root;pwd=3585;port=3306;database=DBTourStop2;";
            Common.AppSettings.AppSettings.ConnectionString = connectionString;
            var optionsBuilder = new DbContextOptionsBuilder<TourStopContext>();
            optionsBuilder.UseMySQL(AppSettings.ConnectionString);


            //USER TESTING
            var userRepo = new UserRepository(new TourStopContext(optionsBuilder.Options));
            var users = new List<User>();
            Console.WriteLine("Adding User");
            users.Add(user);
            userRepo.Add(users);
            Console.WriteLine("User added with Id="+users.First().Id);
            var newusers = userRepo.GetQueryable().Where(x => x.Email == "test_unitesting@test.com").ToList();
            var user1 = newusers.First();
            Console.WriteLine("Updating User Firstname: "+user1.FirstName);
            user1.FirstName = "works";
            userRepo.Update(newusers);
            Console.WriteLine("Updated User Firstname: " + newusers.First().FirstName);


            //REMOVE
            userRepo.Remove(newusers);
            Console.WriteLine("User Removed");
            Console.ReadLine();
        
            
        }
    }
}
