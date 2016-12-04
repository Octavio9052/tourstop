﻿using Common.Enums;

namespace Common.DTOs
{
    public class AddressDTO : BaseDTO
    {
        public override int Id { get; set; }
        public string Name { get; set; }
        public string Street1 { get; set; }
        public string Street2 { get; set; }
        public string City { get; set; }
        public string State { get; set; }
        public int PostalCode { get; set; }
        public CountryCode CountryCode { get; set; }
    }
}