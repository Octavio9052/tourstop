using Common.AppSettings;
using DataAccessLayer.Context;
using Microsoft.EntityFrameworkCore;

namespace DataAccessLayer.Factories
{
    public static class TourStopContextFactory
    {
        public static TourStopContext Create()
        {
            var optionsBuilder = new DbContextOptionsBuilder<TourStopContext>();
            optionsBuilder.UseMySql(AppSettings.ConnectionString);
            var context = new TourStopContext(optionsBuilder.Options);
            context.Database.EnsureCreated();
            return context;
        }
    }
}