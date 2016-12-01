using System.Collections.Generic;
using Business.Connectors.Contracts;
using Business.Connectors.Petition;
using Business.Connectors.Response;
using Business.Handlers.Authentication.contracts;
using Business.Handlers.Handlers;
using Business.Handlers.Request;
using Business.Handlers.Validation.Dto;
using Common.DTOs;
using Common.Exceptions;
using Moq;
using Xunit;
using Xunit.Sdk;

namespace Business.Handlers.Tests
{
    public class BaseHandler_Tests
    {
        [Fact]
        public void HandleReadRequest_InvalidFilters_ThrowsInvalidRequestException()
        {
            var connectorMock = new Mock<IUserConnector>();
            var authenticatorMock = new Mock<IRequestAuthenticator>();

            var handler = new UserRequestHandler(connectorMock.Object, UserValidator.All(), authenticatorMock.Object);

            var request = new ReadRequest
            {
                Filters = new List<Filter>
                {
                    new Filter
                    {
                        PropertyName = "Hello",
                        Relatioship = "",
                        Value = ""
                    }
                },
                AuthToken = "qw1we"
            };

            Assert.Throws<InvalidRequestException>(() => handler.HandleReadRequest(request));
        }

        [Fact]
        public void HandleReadRequest_ValidFiltersNoAuthToken_NoException()
        {
            //Mock Setup
            var connectorMock = new Mock<IUserConnector>();
            var authenticatorMock = new Mock<IRequestAuthenticator>();

            connectorMock.Setup(x => x.Get(It.IsAny<ReadBusinessPetition>())).Returns(new BusinessResponse<UserDTO>());
            authenticatorMock.Setup(x => x.Authenticate(It.IsAny<string>())).Returns(new UserDTO());

            var handler = new UserRequestHandler(connectorMock.Object,UserValidator.All(),authenticatorMock.Object );

            var request = new ReadRequest
            {
                Filters = new List<Filter>
                {
                    new Filter
                    {
                        PropertyName = "Email",
                        Relatioship = "=",
                        Value = "foo@bar.com"
                    }
                }
            };

            handler.HandleReadRequest(request);

        }


    }
}