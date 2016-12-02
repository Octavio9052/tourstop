using System.Collections.Generic;
using System.Linq;
using AutoMapper;
using Business.Connectors.Contracts;
using Business.Connectors.Helpers;
using Business.Connectors.Petition;
using Common.DTOs;
using Common.Enums;
using Common.Exceptions;
using DataAccessLayer.Context;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories;
using DataAccessLayer.Repositories.Contracts;
using Microsoft.EntityFrameworkCore;
using Xunit;

namespace Business.Connectors.Tests.ConnectorsTests
{
    /*
    TODO: Every method should be tested in the following ways:
        - NoFilter
        - NoUser
        - NoData
        Each with it's valid counterpart and combine them
    */

    public class UserConnector_Tests
    {
        private readonly IUserRepository _repository;
        private readonly IUserConnector _connector;

        public UserConnector_Tests()
        {
            var options = new DbContextOptionsBuilder<TourStopContext>()
                .UseInMemoryDatabase("TourStop_Test_Db")
                .Options;

            _repository = new UserRepository(new TourStopContext(options));

            var mapper = new MapperConfiguration(x =>
                    x.AddProfile(new AutoMapperConfiguration())).CreateMapper();

            _connector = new UserConnector(_repository, mapper);

            BootstrapDbInformation();
        }

        private void BootstrapDbInformation()
        {
            var users = new List<User>
            {
                new User
                {
                    FirstName = "FirstName",
                    LastName = "LastName",
                    Email = "foo1@bar.com",
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
                    Phone = "6461235856",
                    UserType = UserType.Promoter
                },
                new User
                {
                    FirstName = "FirstName",
                    LastName = "LastName",
                    Email = "foo2@bar.com",
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
                    Phone = "6461235896",
                    UserType = UserType.Promoter
                },
                new User
                {
                    FirstName = "FirstName",
                    LastName = "LastName",
                    Email = "foo3@bar.com",
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
                    Phone = "6461235898",
                    UserType = UserType.Promoter
                },
                new User
                {
                    FirstName = "FirstName",
                    LastName = "LastName",
                    Email = "foo4@bar.com",
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
                    Phone = "6461235896",
                    UserType = UserType.Promoter
                },
                new User
                {
                    FirstName = "FirstName",
                    LastName = "LastName",
                    Email = "foo5@bar.com",
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
                    Phone = "6461235898",
                    UserType = UserType.Promoter
                }
            };

            users.ForEach(x => _repository.AddOrUpdate(x));
            _repository.SaveChanges();
        }

        #region Get

        [Fact]
        public void Get_NoFiltersNoUser_ThrowsAuthenticationException()
        {
            var petition = new ReadBusinessPetition
            {
                Action = PetitionAction.Read
            };

            Assert.Throws<AuthenticationException>(() => _connector.Get(petition));
        }

        [Fact]
        public void Get_FilteredValidUser_FilteredUsers()
        {
            var petition = new ReadBusinessPetition
            {
                Action = PetitionAction.Read,
                FilterString = "email = foo1@bar.com",
                RequestingUser = new UserDTO
                {
                    Id = 1
                }
            };

            var result = _connector.Get(petition).Data;

            Assert.All(result, x => Assert.Equal(x.Email, "foo1@bar.com"));
        }

        #endregion

        #region Save

        [Fact]
        public void Save_ValidDataNoUser_NoException()
        {
            var petition = new ReadWriteBusinessPetition<UserDTO>
            {
                Action = PetitionAction.ReadWrite,
                Data = new List<UserDTO>
                {
                    new UserDTO
                    {
                        FirstName = "FirstName",
                        LastName = "LastName",
                        Email = "fooSaveValid@bar.com",
                        Address = new AddressDTO
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
                        Phone = "6461235898",
                        UserType = UserType.Promoter
                    }
                }
            };

            _connector.Save(petition);

            var savedUser = _repository.GetQueryable().Where(x => x.Email == "fooSaveValid@bar.com");

            Assert.NotEmpty(savedUser);
        }

        [Fact]
        public void Update_ValidDataValidUser_NoException()
        {
            var petition = new ReadWriteBusinessPetition<UserDTO>
            {
                Action = PetitionAction.ReadWrite,
                Data = new List<UserDTO>
                {
                    new UserDTO
                    {
                        Id = 2,
                        FirstName = "FirstName",
                        LastName = "LastName",
                        Email = "fooUpdateValid@bar.com",
                        Address = new AddressDTO
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
                        Phone = "6461235898",
                        UserType = UserType.Promoter
                    }
                },
                RequestingUser = new UserDTO
                {
                    Id = 2
                }
            };

            _connector.Save(petition);

            var savedUser = _repository.GetQueryable().Where(x => x.Email == "fooUpdateValid@bar.com");

            Assert.NotEmpty(savedUser);
        }

        [Fact]
        public void Update_ValidDataNoUser_ThrowsAuthenticationException()
        {
            var petition = new ReadWriteBusinessPetition<UserDTO>
            {
                Action = PetitionAction.ReadWrite,
                Data = new List<UserDTO>
                {
                    new UserDTO
                    {
                        Id = 1,
                        FirstName = "FirstName",
                        LastName = "LastName",
                        Email = "fooUpdateValid@bar.com",
                        Address = new AddressDTO
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
                        Phone = "6461235898",
                        UserType = UserType.Promoter
                    }
                }
            };

            Assert.Throws<AuthenticationException>(() => _connector.Save(petition));
        }

        [Fact]
        public void Update_ValidDataNoCorrespondingUser_ThrowsAuthenticationException()
        {
            var petition = new ReadWriteBusinessPetition<UserDTO>
            {
                Action = PetitionAction.ReadWrite,
                Data = new List<UserDTO>
                {
                    new UserDTO
                    {
                        Id = 1,
                        FirstName = "FirstName",
                        LastName = "LastName",
                        Email = "fooUpdateValid@bar.com",
                        Address = new AddressDTO
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
                        Phone = "6461235898",
                        UserType = UserType.Promoter
                    }
                },
                RequestingUser = new UserDTO
                {
                    Id = 2
                }
            };

            Assert.Throws<AuthenticationException>(() => _connector.Save(petition));
        }

        #endregion

        #region Delete

        [Fact]
        public void Delete_FilteredNoUser_ThrowAuthenticationException()
        {
            var petition = new ReadWriteBusinessPetition<UserDTO>
            {
                Action = PetitionAction.Delete,
                Data = new List<UserDTO>
                {
                    new UserDTO
                    {
                        Id = 2
                    }
                }
            };

            Assert.Throws<AuthenticationException>(() => _connector.Delete(petition));
        }

        [Fact]
        public void Delete_ValidDataValidUser_NoException()
        {
            var petition = new ReadWriteBusinessPetition<UserDTO>
            {
                Action = PetitionAction.ReadWrite,
                Data = new List<UserDTO>
                {
                    new UserDTO
                    {
                        Id = 2,
                        FirstName = "FirstName",
                        LastName = "LastName",
                        Email = "fooUpdateValid@bar.com",
                        Address = new AddressDTO
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
                        Phone = "6461235898",
                        UserType = UserType.Promoter
                    }
                },
                RequestingUser = new UserDTO
                {
                    Id = 2
                }
            };

            _connector.Delete(petition);

            var allRegistries = _repository.GetAll();

            Assert.All(allRegistries, x => Assert.NotEqual(x.Id, 2));
        }

        [Fact]
        public void Delete_ValidDataNoCorrespondingUser_ThrowsAuthenticationException()
        {
            var petition = new ReadWriteBusinessPetition<UserDTO>
            {
                Action = PetitionAction.Delete,
                Data = new List<UserDTO>
                {
                    new UserDTO
                    {
                        Id = 2,
                        FirstName = "firstname",
                        LastName = "lastname",
                        Email = "fooupdatevalid@bar.com",
                        AddressId = 1,
                        LanguageCode = LanguageCode.EN,
                        Password = "passwod",
                        Phone = "6461235898",
                        UserType = UserType.Promoter
                    }
                },
                RequestingUser = new UserDTO
                {
                    Id = 3
                }
            };

            Assert.Throws<AuthenticationException>(() => _connector.Delete(petition));
        }


        [Fact]
        public void Delete_NoDataValidUser_ThrowsAuthenticationException()
        {
            var petition = new ReadWriteBusinessPetition<UserDTO>
            {
                Action = PetitionAction.Delete,
                RequestingUser = new UserDTO
                {
                    Id = 2
                }
            };

            Assert.Throws<AuthenticationException>(() => _connector.Delete(petition));
        }

        #endregion
    }
}