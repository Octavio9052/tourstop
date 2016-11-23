using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Logging;
using DataAccessLayer.Repositories.Contracts;
using DataAccessLayer.Repositories;
using DataAccessLayer.Context;
using MySQL.Data.EntityFrameworkCore.Extensions;

namespace TestApi
{
    public class Startup
    {
        public Startup(IHostingEnvironment env)
        {
            var builder = new ConfigurationBuilder()
                .SetBasePath(env.ContentRootPath)
                .AddJsonFile("appsettings.json", optional: true, reloadOnChange: true)
                .AddJsonFile($"appsettings.{env.EnvironmentName}.json", optional: true)
                .AddEnvironmentVariables();
            Configuration = builder.Build();
        }

        public IConfigurationRoot Configuration { get; }

        // This method gets called by the runtime. Use this method to add services to the container.
        public void ConfigureServices(IServiceCollection services)
        {
            // Add framework services.
            services.AddMvc();
            services.AddDbContext<TourStopContext>(x => x.UseMySQL(@"server=localhost;userid=root;pwd=3585;port=3306;database=DBTourStop2;"));

            //Repositories
            services.AddScoped<IAddressRepository, AddressRepository>();
            services.AddScoped<ICheckPointRepository, CheckPointRepository>();
            services.AddScoped<IMessageRepository, MessageRepository>();
            services.AddScoped<IMovementRepository, MovementRepository>();
            services.AddScoped<IOrderRepository, OrderRepository>();
            services.AddScoped<IPaymentInfoRepository, PaymentInfoRepository>();
            services.AddScoped<IRatingRepository, RatingRepository>();
            services.AddScoped<ITourRepository, TourRepository>();
            services.AddScoped<IUserRepository, UserRepository>();



           
        }

        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure(IApplicationBuilder app, IHostingEnvironment env, ILoggerFactory loggerFactory)
        {
            loggerFactory.AddConsole(Configuration.GetSection("Logging"));
            loggerFactory.AddDebug();

            app.UseMvc();
        }
    }
}
