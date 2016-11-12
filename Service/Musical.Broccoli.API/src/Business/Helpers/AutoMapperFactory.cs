using AutoMapper;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;


namespace Business.Helpers
{
    public static class AutoMapperFactory
    {
        private static IMapper _mapper;

        public static IMapper Mappers => _mapper ?? (_mapper = new MapperConfiguration(x => { x.AddProfile(new AutoMapperConfiguration()); }).CreateMapper());
       
    }
}
