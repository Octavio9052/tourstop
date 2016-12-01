using AutoMapper;

namespace Business.Connectors.Helpers
{
    public static class AutoMapperFactory
    {
        private static IMapper _mapper;

        public static IMapper Mappers
            =>
            _mapper ??
            (_mapper = new MapperConfiguration(x => { x.AddProfile(new AutoMapperConfiguration()); }).CreateMapper());
    }
}