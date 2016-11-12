using DataAccessLayer.Entities;
using Microsoft.EntityFrameworkCore;
using MySQL.Data.EntityFrameworkCore.Extensions;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace DataAccessLayer.Context
{
    public class TourStopContext : DbContext
    {
        public TourStopContext(DbContextOptions<TourStopContext> options) : base(options)
        {

        }
        public DbSet<Address> Addresses { get; set; }
        public DbSet<CheckPoint> CheckPoints { get; set; }
        public DbSet<Message> Messages { get; set; }
        public DbSet<MessageHasReciever> MessageHasReciever { get; set; }
        public DbSet<Movement> Movements { get; set; }
        public DbSet<Order> Orders { get; set; }
        public DbSet<PaymentInfo> PaymentInfos { get; set; }
        public DbSet<Promotion> Promotions { get; set; }
        public DbSet<Rating> Ratings { get; set; }
        public DbSet<Reservation> Reservations { get; set; }
        public DbSet<Tour> Tours { get; set; }
        public DbSet<User> Users { get; set; }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            #region AddressConfig
            modelBuilder.Entity<Address>().Property(x => x.Name).IsRequired();
            modelBuilder.Entity<Address>().Property(x => x.Street1).IsRequired();
            modelBuilder.Entity<Address>().Property(x => x.State).IsRequired();
            modelBuilder.Entity<Address>().Property(x => x.PostalCode).IsRequired();
            modelBuilder.Entity<Address>().Property(x => x.City).IsRequired();
            modelBuilder.Entity<Address>().Property(x => x.CountryCode).IsRequired();
            #endregion

            #region CheckpointCondig
            modelBuilder.Entity<CheckPoint>().Property(x => x.AddressId).IsRequired();
            modelBuilder.Entity<CheckPoint>().Property(x => x.StartTime).IsRequired();
            modelBuilder.Entity<CheckPoint>().Property(x => x.TourId).IsRequired();
            #endregion

            #region MessageConfig
            modelBuilder.Entity<Message>().Property(x => x.Content).IsRequired();
            modelBuilder.Entity<Message>().Property(x => x.SenderId).IsRequired();
            modelBuilder.Entity<Message>().Property(x => x.DateCreated).IsRequired();
            modelBuilder.Entity<Message>().HasMany(x => x.MessageHasRecievers);
            #endregion

            #region MessageHasRecieverConfig
            modelBuilder.Entity<MessageHasReciever>().Property(x => x.MessageId).IsRequired();
            modelBuilder.Entity<MessageHasReciever>().Property(x => x.RecieverId).IsRequired();
            #endregion

            #region MovementCondig
            modelBuilder.Entity<Movement>().Property(x => x.ReservationId).IsRequired();
            modelBuilder.Entity<Movement>().Property(x => x.MovementsType).IsRequired();
            modelBuilder.Entity<Movement>().Property(x => x.OrderId).IsRequired();
            #endregion

            #region OrderConfig
            modelBuilder.Entity<Order>().Property(x => x.UserId).IsRequired();
            modelBuilder.Entity<Order>().Property(x => x.TotalAmount).IsRequired();
            modelBuilder.Entity<Order>().Property(x => x.PaymentType).IsRequired();
            modelBuilder.Entity<Order>().HasMany(x => x.Reservations);
            #endregion

            #region PaymentInfoConfig
            modelBuilder.Entity<PaymentInfo>().Property(x => x.UserId).IsRequired();
            //PENDING
            #endregion

            #region PromotionConfig
            modelBuilder.Entity<Promotion>().Property(x => x.Value).IsRequired();
            modelBuilder.Entity<Promotion>().Property(x => x.PromoCode).IsRequired();
            modelBuilder.Entity<Promotion>().Property(x => x.Description).IsRequired();
            #endregion

            #region RatingConfig
            modelBuilder.Entity<Rating>().Property(x => x.UserId).IsRequired();
            modelBuilder.Entity<Rating>().Property(x => x.TourId).IsRequired();
            modelBuilder.Entity<Rating>().Property(x => x.RatingValue).IsRequired();
            #endregion

            #region ReservationConfig
            modelBuilder.Entity<Reservation>().Property(x => x.UserId).IsRequired();
            modelBuilder.Entity<Reservation>().Property(x => x.TourId).IsRequired();
            modelBuilder.Entity<Reservation>().Property(x => x.OrderId).IsRequired();
            modelBuilder.Entity<Reservation>().Property(x => x.DateCreated).IsRequired();
            modelBuilder.Entity<Reservation>().Property(x => x.Status).IsRequired();
            #endregion

            #region TourConfig
            modelBuilder.Entity<Tour>().Property(x => x.UserId).IsRequired();
            modelBuilder.Entity<Tour>().Property(x => x.DateCreated).IsRequired();
            modelBuilder.Entity<Tour>().Property(x => x.DateModified).IsRequired();
            modelBuilder.Entity<Tour>().Property(x => x.Title).IsRequired();
            modelBuilder.Entity<Tour>().Property(x => x.Status).IsRequired();
            modelBuilder.Entity<Tour>().Property(x => x.MaxReservation).IsRequired();
            modelBuilder.Entity<Tour>().Property(x => x.ReservationPrice).IsRequired();
            modelBuilder.Entity<Tour>().HasMany(x => x.Ratings);
            modelBuilder.Entity<Tour>().HasMany(x => x.Reservations);
            #endregion

            #region UserConfig
            modelBuilder.Entity<User>().Property(x => x.Phone).IsRequired();
            modelBuilder.Entity<User>().Property(x => x.FirstName).IsRequired();
            modelBuilder.Entity<User>().Property(x => x.LastName).IsRequired();
            modelBuilder.Entity<User>().Property(x => x.AddressId).IsRequired();
            modelBuilder.Entity<User>().Property(x => x.Email).IsRequired();
            modelBuilder.Entity<User>().Property(x => x.UserType).IsRequired();
            modelBuilder.Entity<User>().HasMany(x => x.Orders);
            modelBuilder.Entity<User>().HasMany(x => x.Ratings);
            modelBuilder.Entity<User>().HasMany(x => x.Reservations);
            modelBuilder.Entity<User>().HasMany(x => x.Tours);
            modelBuilder.Entity<User>().HasMany(x => x.Messages);
            modelBuilder.Entity<User>().HasMany(x => x.MessageHasRecievers);
            #endregion




        }


    }

    }
