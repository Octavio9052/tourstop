using System;
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
            var petition = ParseRequest<ReadBusinessPetition, ReadRequest>(request,
                ReadRequestValidator.GetValidator());

            var businessResponse = _connector.Get(petition);
            var response = (Response<T>) businessResponse;
            return response;
        }

        public Response<T> HandleReadWriteRequest(ReadWriteRequest<T> request)
        {
            var petition = ParseRequest<ReadWriteBusinessPetition<T>, ReadWriteRequest<T>>(request,
                ReadWriteRequestValidator<T>.Build(_validator));

            var businessResponse = _connector.Save(petition);
            var response = (Response<T>) businessResponse;
            return response;
        }

        public Response<T> HandleDeleteRequest(ReadWriteRequest<T> request)
        {
            var petition = ParseRequest<ReadWriteBusinessPetition<T>, ReadWriteRequest<T>>(request,
                ReadWriteRequestValidator<T>.Build(_validator));

            var businessResponse = _connector.Delete(petition);
            var response = (Response<T>) businessResponse;
            return response;
        }

        private TPetition ParseRequest<TPetition, TRequest>(TRequest request, BaseValidator<TRequest> validator)
            where TPetition : BusinessPetition where TRequest : Request.Request
        {
            if (!validator.Validate(request).IsValid) throw new AuthenticationException();

            var petition = (TPetition) request;
            petition.RequestingUser = _authenticator.Authenticate(request.AuthToken);
            return petition;
        }
    }
}