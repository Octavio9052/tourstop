using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using Common.Enums;
using DataAccessLayer.Context;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories;
using DataAccessLayer.Repositories.Contracts;
using Microsoft.EntityFrameworkCore;
using MySQL.Data.EntityFrameworkCore.Extensions;
using Xunit;

namespace DataAccess.Tests.Repositories
{
    public class Repository_Tests
    {
        private readonly IUserRepository _userRepository;

        public Repository_Tests()
        {
            var options = new DbContextOptionsBuilder<TourStopContext>()
                .UseInMemoryDatabase("TourStop_Test_Db")
                .Options;

            _userRepository = new UserRepository(new TourStopContext(options));
        }

        [Fact]
        public void Add_User_True()
        {
            var user = new User
            {
                FirstName = "FirstName",
                LastName = "LastName",
                Email = "fooAdd@bar.com",
                Address = new Address
                {
                    Street1 = "St1",
                    City = "City",
                    CountryCode = CountryCode.MX,
                    PostalCode = 2284,
                    State = "State",
                    Name = ""
                },
                LanguageCode = LanguageCode.EN,
                Password = "passwod",
                Phone = "64612358",
                UserType = UserType.Promotor
            };

            _userRepository.AddOrUpdate(user);

            Assert.Contains(user, _userRepository.GetAll());
        }

        [Fact]
        public void Delete_User_True()
        {
            var user = new User
            {
                FirstName = "FirstName",
                LastName = "LastName",
                Email = "fooDelete@bar.com",
                Address = new Address
                {
                    Street1 = "St1",
                    City = "City",
                    CountryCode = CountryCode.MX,
                    PostalCode = 2284,
                    State = "State",
                    Name = ""
                },
                LanguageCode = LanguageCode.EN,
                Password = "passwod",
                Phone = "64612358",
                UserType = UserType.Promotor
            };

            _userRepository.AddOrUpdate(user);
            _userRepository.Remove(user);

            Assert.DoesNotContain(user,
                _userRepository.GetAll());
        }

        [Fact]
        public void GetAll_User_TwoRegistries()
        {
            _userRepository.GetAll().ToList().ForEach(x => _userRepository.Remove(x)); //Clear Database

            var users = new List<User>
            {
                new User
                {
                    FirstName = "FirstName",
                    LastName = "LastName",
                    Email = "fooGetAll1@bar.com",
                    Address = new Address
                    {
                        Street1 = "St1",
                        City = "City",
                        CountryCode = CountryCode.MX,
                        PostalCode = 2284,
                        State = "State",
                        Name = ""
                    },
                    LanguageCode = LanguageCode.EN,
                    Password = "passwod",
                    Phone = "64612358",
                    UserType = UserType.Promotor
                },
                new User
                {
                    FirstName = "FirstName",
                    LastName = "LastName",
                    Email = "fooGetAll2@bar.com",
                    Address = new Address
                    {
                        Street1 = "St1",
                        City = "City",
                        CountryCode = CountryCode.MX,
                        PostalCode = 2284,
                        State = "State",
                        Name = ""
                    },
                    LanguageCode = LanguageCode.EN,
                    Password = "passwod",
                    Phone = "64612358",
                    UserType = UserType.Promotor
                }
            };

            users.ForEach(x => _userRepository.AddOrUpdate(x));
            Assert.True(_userRepository.GetAll().Count == users.Count);
        }

        [Fact]
        public void Update_User_True()
        {
            var users = _userRepository.GetAll().Where(x => x.Id % 2 == 0).ToList();

            users.ForEach(x => x.FirstName = "NewUpdatedName");

            users.ForEach(x => _userRepository.AddOrUpdate(x));

            var updatedUsers = _userRepository.GetQueryable().Where(x => x.Id % 2 == 0).ToList();

            Assert.True(updatedUsers.All(x => x.FirstName == "NewUpdatedName"));
        }

        [Fact]
        public void WhereLinq_UsersWithFooByName_True()
        {
            var users = new List<User>
            {
                new User
                {
                    FirstName = "Foo",
                    LastName = "LastName",
                    Email = "fooLinq1@bar.com",
                    Address = new Address
                    {
                        Street1 = "St1",
                        City = "City",
                        CountryCode = CountryCode.MX,
                        PostalCode = 2284,
                        State = "State",
                        Name = ""
                    },
                    LanguageCode = LanguageCode.EN,
                    Password = "passwod",
                    Phone = "64612358",
                    UserType = UserType.Promotor
                },
                new User
                {
                    FirstName = "Foo",
                    LastName = "LastName",
                    Email = "fooLinq2@bar.com",
                    Address = new Address
                    {
                        Street1 = "St1",
                        City = "City",
                        CountryCode = CountryCode.MX,
                        PostalCode = 2284,
                        State = "State",
                        Name = ""
                    },
                    LanguageCode = LanguageCode.EN,
                    Password = "passwod",
                    Phone = "64612358",
                    UserType = UserType.Promotor
                },
                new User
                {
                    FirstName = "Foo",
                    LastName = "LastName",
                    Email = "fooLinq3@bar.com",
                    Address = new Address
                    {
                        Street1 = "St1",
                        City = "City",
                        CountryCode = CountryCode.MX,
                        PostalCode = 2284,
                        State = "State",
                        Name = ""
                    },
                    LanguageCode = LanguageCode.EN,
                    Password = "passwod",
                    Phone = "64612358",
                    UserType = UserType.Promotor
                }
            };

            users.ForEach(x => _userRepository.AddOrUpdate(x));
            var result = _userRepository.GetQueryable().Where(x => x.FirstName == "Foo");
            Assert.True(result.All(x => x.FirstName == "Foo"));
        }
    }
}