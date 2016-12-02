using System.Collections.Generic;
using Business.Connectors.Contracts;
using Business.Connectors.Response;
using Business.Handlers.Authentication.contracts;
using Business.Handlers.Handlers;
using Business.Handlers.Request;
using Business.Handlers.Validation.Dto;
using Common.DTOs;
using Common.Exceptions;
using Moq;
using Xunit;

namespace Business.Handlers.Tests
{
    public class BaseHandler_Tests
    {
        #region Read Request

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
                        Relationship = "",
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

            connectorMock.SetupGet(x => x.Get).Returns(x => new BusinessResponse<UserDTO>());
            authenticatorMock.Setup(x => x.Authenticate(It.IsAny<string>())).Returns(new UserDTO());

            var handler = new UserRequestHandler(connectorMock.Object, UserValidator.All(), authenticatorMock.Object);

            var request = new ReadRequest
            {
                Filters = new List<Filter>
                {
                    new Filter
                    {
                        PropertyName = "Email",
                        Relationship = "=",
                        Value = "foo@bar.com"
                    }
                }
            };

            handler.HandleReadRequest(request);
        }

        [Fact]
        public void HandleReadRequest_NoFiltersNoAuthToken_NoException()
        {
            //Mock Setup
            var connectorMock = new Mock<IUserConnector>();
            var authenticatorMock = new Mock<IRequestAuthenticator>();

            connectorMock.SetupGet(x => x.Get).Returns(x => new BusinessResponse<UserDTO>());
            authenticatorMock.Setup(x => x.Authenticate(It.IsAny<string>())).Returns(new UserDTO());

            var handler = new UserRequestHandler(connectorMock.Object, UserValidator.All(), authenticatorMock.Object);

            var request = new ReadRequest();

            handler.HandleReadRequest(request);
        }

        #endregion

        #region ReadWriteRequest

        [Fact]
        public void HandleReadWriteRequest_InvalidData_ThrowsInvalidRequestException()
        {
            //Mock Setup
            var connectorMock = new Mock<IUserConnector>();
            var authenticatorMock = new Mock<IRequestAuthenticator>();

            connectorMock.SetupGet(x => x.Save).Returns(x => new BusinessResponse<UserDTO>());
            authenticatorMock.Setup(x => x.Authenticate(It.IsAny<string>())).Returns(new UserDTO());

            var handler = new UserRequestHandler(connectorMock.Object, UserValidator.All(), authenticatorMock.Object);

            var request = new ReadWriteRequest<UserDTO>
            {
                Data = new List<UserDTO>
                {
                    new UserDTO()
                }
            };

            Assert.Throws<InvalidRequestException>(() => handler.HandleReadWriteRequest(request));
        }

        #endregion

        #region DeleteRequest

        #endregion
    }
}