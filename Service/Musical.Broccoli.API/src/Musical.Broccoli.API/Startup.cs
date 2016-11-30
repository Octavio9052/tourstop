using System.Security.Cryptography.X509Certificates;
using AutoMapper;
using Business.Connectors;
using Business.Connectors.Helpers;
using Business.Contracts;
using Business.Handlers.Handlers;
using Business.Handlers.Handlers.contracts;
using Business.Handlers.Validation;
using Common.AppSettings;
using DataAccessLayer.Context;
using DataAccessLayer.Repositories;
using DataAccessLayer.Repositories.Contracts;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Logging;
using MySQL.Data.EntityFrameworkCore.Extensions;

namespace Musical.Broccoli.API
{
    public class Startup
    {
        private readonly MapperConfiguration _mapperConfiguration;

        public Startup(IHostingEnvironment env)
        {
            var builder = new ConfigurationBuilder()
                .SetBasePath(env.ContentRootPath)
                .AddJsonFile("appsettings.json", optional: true, reloadOnChange: true)
                .AddJsonFile($"appsettings.{env.EnvironmentName}.json", optional: true);

            if (env.IsEnvironment("Development"))
            {
                // This will push telemetry data through Application Insights pipeline faster, allowing you to view results immediately.
                builder.AddApplicationInsightsSettings(developerMode: true);
            }

            builder.AddEnvironmentVariables();
            Configuration = builder.Build();

            _mapperConfiguration = new MapperConfiguration(x => x.AddProfile(new AutoMapperConfiguration()));
        }

        public IConfigurationRoot Configuration { get; }

        // This method gets called by the runtime. Use this method to add services to the container
        public void ConfigureServices(IServiceCollection services)
        {
            // Add framework services.
            services.AddApplicationInsightsTelemetry(Configuration);

            services.AddMvc();

            #region Dependency Injection

            #region Request Handlers

            services.AddScoped<IMessageRequestHandler, MessageRequestHandler>();
            services.AddScoped<IOrderRequestHandler, OrderRequestHandler>();
            services.AddScoped<ITourRequestHandler, TourRequestHandler>();
            services.AddScoped<IUserRequestHandler, UserRequestHandler>();

            #endregion

            #region Validators

            services.AddScoped(x => MessageValidator.All());
            services.AddScoped(x => OrderValidator.All());
            services.AddScoped(x => TourValidator.All());
            services.AddScoped(x => UserValidator.All());

            #endregion

            #region Connectors

            services.AddTransient<IAddressConnector, AddressConnector>();
            services.AddTransient<ICheckPointConnector, CheckPointConnector>();
            services.AddTransient<IMessageConnector, MessageConnector>();
            services.AddTransient<IMovementConnector, MovementConnector>();
            services.AddTransient<IOrderConnector, OrderConnector>();
            services.AddTransient<IPaymentInfoConnector, PaymentInfoConnector>();
            services.AddTransient<IRatingConnector, RatingConnector>();
            services.AddTransient<ITourConnector, TourConnector>();
            services.AddTransient<IUserConnector, UserConnector>();

            #endregion

            #region Repositories

            services.AddSingleton<IAddressRepository, AddressRepository>();
            services.AddSingleton<ICheckPointRepository, CheckPointRepository>();
            services.AddSingleton<IMessageRepository, MessageRepository>();
            services.AddSingleton<IMovementRepository, MovementRepository>();
            services.AddSingleton<IOrderRepository, OrderRepository>();
            services.AddSingleton<IPaymentInfoRepository, PaymentInfoRepository>();
            services.AddSingleton<IPromotionRepository, PromotionRepository>();
            services.AddSingleton<IReservationRepository, ReservationRepository>();
            services.AddSingleton<IRatingRepository, RatingRepository>();
            services.AddSingleton<ISessionRepository, SessionRepository>();
            services.AddSingleton<ITourRepository, TourRepository>();
            services.AddSingleton<IUserRepository, UserRepository>();

            #endregion

            //AutoMapper
            services.AddSingleton(x => _mapperConfiguration.CreateMapper());

            #endregion

            services.AddDbContext<TourStopContext>(
                options => options.UseMySQL(Configuration.GetConnectionString("DefaultConnection")));
        }

        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline
        public void Configure(IApplicationBuilder app, IHostingEnvironment env, ILoggerFactory loggerFactory)
        {
            loggerFactory.AddConsole(Configuration.GetSection("Logging"));
            loggerFactory.AddDebug();

            app.UseApplicationInsightsRequestTelemetry();

            app.UseApplicationInsightsExceptionTelemetry();

            app.UseMvc();
        }
    }
}