using Business.Connectors.Contracts;
using Business.Connectors.Petition;
using Business.Handlers.Authentication.contracts;
using Business.Handlers.Response;
using Business.Handlers.Request;
using Business.Handlers.Validation;
using Business.Handlers.Validation.Request;
using Business.Handlers.Handlers.contracts;
using Common.DTOs;
using Common.Exceptions;


namespace Business.Handlers.Handlers
{
    public abstract class BaseRequestHandler<T> : IBaseRequestHandler<T> where T : BaseDTO
    {
        private readonly IBaseConnector<T> _connector;
        private readonly BaseValidator<T> _validator;
        private readonly IRequestAuthenticator _authenticator;

        protected BaseRequestHandler(IBaseConnector<T> connector, BaseValidator<T> validator,
            IRequestAuthenticator authenticator)
        {
            _connector = connector;
            _validator = validator;
            _authenticator = authenticator;
        }

        #region Handle Methods

        public Response<T> HandleReadRequest(ReadRequest request)
        {
            ValidateRequest(request, ReadRequestValidator.GetValidator());

            var petition = ParseReadRequest(request);

            var businessResponse = _connector.Get(petition);
            var response = (Response<T>) businessResponse;
            return response;
        }

        public Response<T> HandleReadWriteRequest(ReadWriteRequest<T> request)
        {
            ValidateRequest(request, ReadWriteRequestValidator<T>.Build(_validator));

            var petition = ParseReadWriteRequest(request);

            var businessResponse = _connector.Save(petition);
            var response = (Response<T>) businessResponse;
            return response;
        }

        public Response<T> HandleDeleteRequest(ReadWriteRequest<T> request)
        {
            ValidateRequest(request, ReadWriteRequestValidator<T>.Build(_validator));

            var petition = ParseReadWriteRequest(request);

            var businessResponse = _connector.Delete(petition);
            var response = (Response<T>) businessResponse;
            return response;
        }

        #endregion

        private static void ValidateRequest<TRequest>(TRequest request, BaseValidator<TRequest> validator)
        {
            if (!validator.Validate(request).IsValid) throw new InvalidRequestException();
        }

        private ReadBusinessPetition ParseReadRequest(ReadRequest request)
        {
            var petition = (ReadBusinessPetition) request;
            petition.RequestingUser = _authenticator.Authenticate(request.AuthToken);
            return petition;
        }

        private ReadWriteBusinessPetition<T> ParseReadWriteRequest(ReadWriteRequest<T> request)
        {
            var petition = (ReadWriteBusinessPetition<T>) request;
            petition.RequestingUser = _authenticator.Authenticate(request.AuthToken);
            return petition;
        }
    }
}