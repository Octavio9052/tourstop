﻿using System;
using System.Linq;
using Common.DTOs;

namespace Business.Handlers.Validation.Dto
{
    public class MessageValidator : BaseValidator<MessageDTO>
    {
        public override Func<MessageDTO, ValidationResult> Validate { get; internal set; }

        public MessageValidator And(MessageValidator other)
        {
            return new MessageValidator
            {
                Validate = x => Validate(x) + other.Validate(x)
            };
        }

        public static MessageValidator Holds(Predicate<MessageDTO> predicate, string message)
        {
            return new MessageValidator
            {
                Validate = x => predicate.Invoke(x) ? ValidationResult.Valid() : ValidationResult.Invalid(message)
            };
        }

        #region Validators

        public static MessageValidator HasId()
        {
            return Holds(x => x.Id > 0, "Invalid Id");
        }

        public static MessageValidator ContentIsNotEmpty()
        {
            return Holds(x => string.IsNullOrEmpty(x.Content), "Content is null or empty");
        }

        public static MessageValidator UserIsValid()
        {
            return Holds(x => x.SenderId == 0, "User is invalid");
        }

        #endregion

        public static MessageValidator All()
        {
            return All(ContentIsNotEmpty(), UserIsValid());
        }

        public static MessageValidator All(params MessageValidator[] validators)
        {
            return validators.Aggregate((x, y) => x.And(y));
        }
    }
}