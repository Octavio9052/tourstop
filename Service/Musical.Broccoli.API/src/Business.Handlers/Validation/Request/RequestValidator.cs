using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Business.Handlers.Request;
using Business.Handlers.Validation;
using Common.DTOs;

namespace Handlers.Validation.Request
{
    public class RequestValidator
    {

        public RequestValidationResult Validate<T>( Request<T> request, BaseValidator<T> validator ) where T : BaseDTO
        {
            return new RequestValidationResult()
            {
                ValidationResult = ValidateFilters( request.Filters ) + ValidateData( request
                .Data, validator )
                //UserDTO = Authenticate(request.AuthToken)
            };

        }

        private ValidationResult ValidateFilters( List<Filter> filters )
        {
            if (filters == null)
            {
                return ValidationResult.Valid();
            }

            return filters.All( x =>
            string.IsNullOrEmpty( x.PropertyName ) &&
            string.IsNullOrEmpty( x.Relatioship ) &&
            x.Value != null ) ?
            ValidationResult.Valid() : ValidationResult.Invalid( "Filters are Invalid" );
        }

        private ValidationResult ValidateData<T>( List<T> data, BaseValidator<T> validator ) where T : BaseDTO
        {
            return data.Select( x => validator.Validate( x ) ).Aggregate( ( x, y ) => x + y );
        }

    }
}
