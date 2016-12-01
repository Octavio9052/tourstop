using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices.ComTypes;
using Common.Enums;
using DataAccessLayer.Context;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories;
using DataAccessLayer.Repositories.Contracts;
using Microsoft.EntityFrameworkCore;
using Xunit;
using Xunit.Abstractions;
using Xunit.Sdk;

namespace DataAccess.Tests
{
    public class BaseRepository_Tests
    {
        private readonly IUserRepository _userRepository;

        public BaseRepository_Tests( ITestOutputHelper output )
        {
            var options = new DbContextOptionsBuilder<TourStopContext>()
                .UseInMemoryDatabase( "TourStop_Test_Db" ).Options;

            _userRepository = new UserRepository( new TourStopContext( options ) );

            BootstrapRepository();
        }

        private void BootstrapRepository()
        {
            var users = new List<User>
            {
                new User
                {
                    FirstName = "FirstName",
                    LastName = "LastName",
                    Email = "fooTest1@bar.com",
                    AddressId = 1,
                    LanguageCode = LanguageCode.EN,
                    Password = "passwod",
                    Phone = "64612358",
                    UserType = UserType.Promotor
                },
                new User
                {
                    FirstName = "FirstName",
                    LastName = "LastName",
                    Email = "fooTest2@bar.com",
                    AddressId = 1,
                    LanguageCode = LanguageCode.EN,
                    Password = "passwod",
                    Phone = "64612358",
                    UserType = UserType.Promotor
                },
                new User
                {
                    FirstName = "FirstName",
                    LastName = "LastName",
                    Email = "fooTest3@bar.com",
                    AddressId = 1,
                    LanguageCode = LanguageCode.EN,
                    Password = "passwod",
                    Phone = "64612358",
                    UserType = UserType.Promotor
                },
                new User
                {
                    FirstName = "FirstName",
                    LastName = "LastName",
                    Email = "fooTest4@bar.com",
                    AddressId = 1,
                    LanguageCode = LanguageCode.EN,
                    Password = "passwod",
                    Phone = "64612358",
                    UserType = UserType.Promotor
                },
                new User
                {
                    FirstName = "FirstName",
                    LastName = "LastName",
                    Email = "fooTest5@bar.com",
                    AddressId = 1,
                    LanguageCode = LanguageCode.EN,
                    Password = "passwod",
                    Phone = "64612358",
                    UserType = UserType.Promotor
                }
            };

            users.ForEach( x => _userRepository.AddOrUpdate( x ) );
            _userRepository.SaveChanges();
        }

        [Fact]
        public void AddOrUpdate_NewUser_DbSetSizeIncreased()
        {
            var usersSize = _userRepository.GetAll().Count;
            var user = new User
            {
                FirstName = "FirstName",
                LastName = "LastName",
                Email = "fooAdd@bar.com",
                AddressId = 1,
                LanguageCode = LanguageCode.EN,
                Password = "passwod",
                Phone = "64612358",
                UserType = UserType.Promotor
            };

            _userRepository.AddOrUpdate( user );
            _userRepository.SaveChanges();

            var allUsers = _userRepository.GetAll();

            Assert.Contains( user, allUsers );

        }

        [Fact]
        public void Delete_User_DbSetDecreased()
        {


            var user = new User
            {
                FirstName = "FirstName",
                LastName = "LastName",
                Email = "fooDelete@bar.com",
                AddressId = 1,
                LanguageCode = LanguageCode.EN,
                Password = "passwod",
                Phone = "64612358",
                UserType = UserType.Promotor
            };

            _userRepository.AddOrUpdate( user );
            _userRepository.SaveChanges();

            var allUsers = _userRepository.GetAll();

            Assert.Contains( user, allUsers );

            _userRepository.Remove( user );
            _userRepository.SaveChanges();

            allUsers = _userRepository.GetAll();

            Assert.DoesNotContain( user, allUsers );
        }

        [Fact]
        public void GetAll_User_TwoRegistries()
        {
            _userRepository.GetAll().ToList()
                .ForEach( x => _userRepository.Remove( x ) ); //Clear Database
            _userRepository.SaveChanges();

            Assert.Empty( _userRepository.GetAll() );

            var users = new List<User>
            {
                new User
                {
                    FirstName = "FirstName",
                    LastName = "LastName",
                    Email = "fooTest1@bar.com",
                    AddressId = 1,
                    LanguageCode = LanguageCode.EN,
                    Password = "passwod",
                    Phone = "64612358",
                    UserType = UserType.Promotor
                },
                new User
                {
                    FirstName = "FirstName",
                    LastName = "LastName",
                    Email = "fooTest2@bar.com",
                    AddressId = 1,
                    LanguageCode = LanguageCode.EN,
                    Password = "passwod",
                    Phone = "64612358",
                    UserType = UserType.Promotor
                },
                new User
                {
                    FirstName = "FirstName",
                    LastName = "LastName",
                    Email = "fooTest3@bar.com",
                    AddressId = 1,
                    LanguageCode = LanguageCode.EN,
                    Password = "passwod",
                    Phone = "64612358",
                    UserType = UserType.Promotor
                },
                new User
                {
                    FirstName = "FirstName",
                    LastName = "LastName",
                    Email = "fooTest4@bar.com",
                    AddressId = 1,
                    LanguageCode = LanguageCode.EN,
                    Password = "passwod",
                    Phone = "64612358",
                    UserType = UserType.Promotor
                },
                new User
                {
                    FirstName = "FirstName",
                    LastName = "LastName",
                    Email = "fooTest5@bar.com",
                    AddressId = 1,
                    LanguageCode = LanguageCode.EN,
                    Password = "passwod",
                    Phone = "64612358",
                    UserType = UserType.Promotor
                }
            };

            users.ForEach( x => _userRepository.AddOrUpdate( x ) );
            _userRepository.SaveChanges();

            var allUsers = _userRepository.GetAll();
            Assert.Equal( users.Count, allUsers.Count );
        }

        [Fact]
        public void Update_User_UserChanged()
        {
            var users = _userRepository.GetAll().Where( x => x.Id % 2 == 0 ).ToList();

            users.ForEach( x => x.FirstName = "NewUpdatedName" );

            users.ForEach( x => _userRepository.AddOrUpdate( x ) );
            _userRepository.SaveChanges();

            var updatedUsers = _userRepository.GetQueryable().Where( x => x.Id % 2 == 0 ).ToList();

            Assert.All( updatedUsers, x => Assert.Equal( x.FirstName, "NewUpdatedName" ) );
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

            users.ForEach( x => _userRepository.AddOrUpdate( x ) );
            _userRepository.SaveChanges();

            var result = _userRepository.GetQueryable().Where( x => x.FirstName == "Foo" );
            Assert.All( result, x => Assert.Equal( x.FirstName, "Foo" ) );
        }
    }
}