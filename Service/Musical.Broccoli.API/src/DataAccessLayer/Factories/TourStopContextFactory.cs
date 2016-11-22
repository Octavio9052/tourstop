using DataAccessLayer.Context;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Common.AppSettings;
using MySQL.Data.EntityFrameworkCore.Extensions;

namespace DataAccessLayer.Factories
{
    public static class TourStopContextFactory
    {
        public static TourStopContext Create()
        {
            var optionsBuilder = new DbContextOptionsBuilder<TourStopContext>();
            optionsBuilder.UseMySQL(AppSettings.ConnectionString);      
            var context = new TourStopContext(optionsBuilder.Options);
            context.Database.EnsureCreated();
            return context;
        }
    }
}
