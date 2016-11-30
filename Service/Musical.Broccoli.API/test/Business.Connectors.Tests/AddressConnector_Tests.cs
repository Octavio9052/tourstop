using AutoMapper;
using Business.Connectors.Helpers;
using Business.Contracts;
using Business.Controllers.Petition;
using Common.DTOs;
using Common.Enums;
using DataAccessLayer.Context;
using DataAccessLayer.Entities;
using DataAccessLayer.Repositories;
using DataAccessLayer.Repositories.Contracts;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Authentication;
using System.Threading.Tasks;
using Xunit;


namespace Business.Connectors.Tests
{
    public class AddressConnector_Tests
    {
        private readonly IAddressRepository _repository;
        private readonly IAddressConnector _connector;
        private readonly IMapper _mapper;

        public AddressConnector_Tests()
        {
            var options = new DbContextOptionsBuilder<TourStopContext>()
                .UseInMemoryDatabase("TourStop_Test_Db")
                .Options;

            _repository = new AddressRepository(new TourStopContext(options));

            _mapper = new MapperConfiguration(x =>
                    x.AddProfile(new AutoMapperConfiguration())).CreateMapper();

            _connector = new AddressConnector(_repository, _mapper);
        }

        private void BootstrapDbInformation()
        {
            var Addresses = new List<Address>
            {
                new Address
                    {
                        Street1 = "St1",
                        City = "City",
                        CountryCode = CountryCode.MX,
                        PostalCode = 2284,
                        State = "State",
                        Name = ""
                     },
                new Address
                    {
                        Street1 = "St1",
                        City = "City",
                        CountryCode = CountryCode.MX,
                        PostalCode = 2284,
                        State = "State",
                        Name = ""
                    },

                new Address
                    {
                        Street1 = "St1",
                        City = "City",
                        CountryCode = CountryCode.MX,
                        PostalCode = 2284,
                        State = "State",
                        Name = ""

                },
                new Address
                    {
                        Street1 = "St1",
                        City = "City",
                        CountryCode = CountryCode.MX,
                        PostalCode = 2284,
                        State = "State",
                        Name = ""
                                  },
                new Address
                    {
                        Street1 = "St1",
                        City = "City",
                        CountryCode = CountryCode.MX,
                        PostalCode = 2284,
                        State = "State",
                        Name = ""

                }
            };

            _repository.Add(Addresses);
        }

        [Fact]
        public void Get_NoFiltersNoAddress_ThrowsAuthenticationException()
        {
            var petition = new BusinessPetition<AddressDTO>
            {
                Action = PetitionAction.Get
            };

            Assert.Throws<AuthenticationException>(() => _connector.Processors[petition.Action](petition));
        }

        [Fact]
        public void Save_ValidDataNoAddress_NoException()
        {
            var petition = new BusinessPetition<AddressDTO>
            {
                Action = PetitionAction.Save,
                Data = new List<AddressDTO>
                {
                    new AddressDTO
                        {
                            Street1 = "St1_Get",
                            City = "City",
                            CountryCode = CountryCode.MX,
                            PostalCode = 2284,
                            State = "State",
                            Name = ""
                         }
                }
            };

            _connector.Processors[petition.Action](petition);
        }

        [Fact]
        public void Update_ValidDataNoAddress_ThrowsAuthenticationException()
        {
            var petition = new BusinessPetition<AddressDTO>
            {
                Action = PetitionAction.Update,
                Data = new List<AddressDTO>
                {
                    new AddressDTO
                    {
                            Id=1,
                            Street1 = "St1",
                            City = "City",
                            CountryCode = CountryCode.MX,
                            PostalCode = 2284,
                            State = "State",
                            Name = ""
                       
                    }
                }
            };

            Assert.Throws<AuthenticationException>(() => _connector.Processors[petition.Action](petition));
        }

        [Fact]
        public void Delete_FilteredNoAddress_ThrowAuthenticationException()
        {
            var petition = new BusinessPetition<AddressDTO>
            {
                Action = PetitionAction.Delete,
                FilterStrings = new List<string>
                {
                    "Street1 = 6461235896"
                }
            };

            Assert.Throws<AuthenticationException>(() => _connector.Processors[petition.Action](petition));
        }

        [Fact]
        public void Get_FilteredValidAddress_FilteredAddresss()
        {
            var petition = new BusinessPetition<AddressDTO>
            {
                Action = PetitionAction.Get,
                FilterStrings = new List<string>
                {
                    "Street1 = St1_Get"
                },
                RequestingUser = new UserDTO
                {
                    Id = 1
                }
            };

            var result = _connector.Processors[petition.Action](petition).Data;

            Assert.All(result, x => Assert.Equal(x.Street1, "St1_Get"));
        }

        [Fact]
        public void Update_ValidDataValidAddress_NoException()
        {
            var petition = new BusinessPetition<AddressDTO>
            {
                Action = PetitionAction.Update,
                Data = new List<AddressDTO>
                {
                    new AddressDTO
                    {
                        Id=2,
                            Street1 = "St1",
                            City = "City",
                            CountryCode = CountryCode.MX,
                            PostalCode = 2284,
                            State = "State",
                            Name = ""
                        }
                },
                RequestingUser = new UserDTO
                {
                    Id = 2
                }
            };

            _connector.Processors[petition.Action](petition);
        }

        [Fact]
        public void Delete_validDataValidAddress_NoException()
        {
            var petition = new BusinessPetition<AddressDTO>
            {
                Action = PetitionAction.Delete,
                Data = new List<AddressDTO>
                {
                    new AddressDTO
                        {
                        Id=2,
                            Street1 = "St1",
                            City = "City",
                            CountryCode = CountryCode.MX,
                            PostalCode = 2284,
                            State = "State",
                            Name = ""
                        }
                },
                RequestingUser = new UserDTO
                {
                    Id = 1
                }
            };

            _connector.Processors[petition.Action](petition);

            var allRegistries = _repository.GetAll();

            Assert.All(allRegistries, x => Assert.NotEqual(x.Id, 2));
        }
    }
}
