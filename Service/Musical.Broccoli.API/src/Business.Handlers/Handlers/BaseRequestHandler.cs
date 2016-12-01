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

        public Response<T> HandleReadRequest(ReadRequest request)
        {
            var requestValidator = ReadRequestValidator.GetValidator();
            if (!requestValidator.Validate(request).IsValid) throw new InvalidRequestException();

            var petition = (ReadBusinessPetition) request;
            petition.Action = PetitionAction.ReadWrite;
            petition.RequestingUser = _authenticator.Authenticate(request.AuthToken);

            var businessResponse = _connector.Get(petition);
            var response = (Response<T>) businessResponse;
            return response;
        }

        public Response<T> HandleReadWriteRequest(ReadWriteRequest<T> request)
        {
            var requestValidator = ReadWriteRequestValidator<T>.Build(_validator);
            if (!requestValidator.Validate(request).IsValid) throw new AuthenticationException();

            var petition = (ReadWriteBusinessPetition<T>) request;
            petition.Action = PetitionAction.ReadWrite;
            petition.RequestingUser = _authenticator.Authenticate(request.AuthToken);

            var businessResponse = _connector.Save(petition);
            var response = (Response<T>) businessResponse;
            return response;
        }

        public Response<T> HandleDeleteRequest(ReadWriteRequest<T> request)
        {
            var requestValidator = ReadWriteRequestValidator<T>.Build(_validator);
            if (!requestValidator.Validate(request).IsValid) throw new AuthenticationException();

            var petition = (ReadWriteBusinessPetition<T>) request;
            petition.Action = PetitionAction.Delete;
            petition.RequestingUser = _authenticator.Authenticate(request.AuthToken);

            var businessResponse = _connector.Delete(petition);
            var response = (Response<T>) businessResponse;
            return response;
        }
    }
}