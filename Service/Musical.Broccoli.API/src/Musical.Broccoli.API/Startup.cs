using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Logging;

namespace Musical.Broccoli.API
{
    public class Startup
    {
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

        }

        public IConfigurationRoot Configuration { get; }

        // This method gets called by the runtime. Use this method to add services to the container
        public void ConfigureServices(IServiceCollection services)
        {
            // Add framework services.
            services.AddApplicationInsightsTelemetry(Configuration);

            services.AddMvc();

            #region Dependency Injection
            //Connectors
            services.AddTransient<IAddressConnector, AddressConnector>();
            services.AddTransient<ICheckPointConnector, CheckPointConnector>();
            services.AddTransient<IMessageConnector, MessageConnector>();
            services.AddTransient<IMovementConnector,MovementConnector>();
            services.AddTransient<IOrderConnector, OrderConnector>();
            services.AddTransient<IPaymentInfoConnector, PaymentInfoConnector>();
            services.AddTransient<IRatingConnector, RatingConnector>();
            services.AddTransient<ITourConnector, TourConnector>();
            services.AddTransient<IUserConnector, UserConnector>();

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
            #endregion


            AppSettings.ConnectionString = Configuration.GetConnectionString("TourStopDB");
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
