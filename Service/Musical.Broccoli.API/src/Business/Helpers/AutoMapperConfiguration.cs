using AutoMapper;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Common.DTOs;
using DataAccessLayer.Entities;


namespace Business.Helpers
{
    public class AutoMapperConfiguration:Profile
    {
        protected override void Configure()
        {
            #region Address
            CreateMap<Address, AddressDTO>();
            CreateMap<AddressDTO, Address>().ForMember(x => x.Id, y => y.Ignore());
            #endregion

            #region Checkpoint
            CreateMap<CheckPoint, CheckPointDTO>();
            CreateMap<CheckPointDTO, CheckPoint>().ForMember(x => x.Id, y => y.Ignore());
            #endregion

            #region Message
            CreateMap<Message, MessageDTO>();
            CreateMap<MessageDTO,Message>().ForMember(x => x.Id, y => y.Ignore());
            #endregion

            #region MessageHasReciever
            CreateMap<MessageHasReciever, MessageHasRecieverDTO>();
            CreateMap<MessageHasRecieverDTO, MessageHasReciever>();
            #endregion

            #region Movement
            CreateMap<Movement, MovementDTO>();
            CreateMap<MovementDTO, Movement>().ForMember(x => x.Id, y => y.Ignore());
            #endregion

            #region Order
            CreateMap<Order, OrderDTO>();
            CreateMap<OrderDTO, Order>().ForMember(x => x.Id, y => y.Ignore());
            #endregion

            #region PaymentInfo
            CreateMap<PaymentInfo, PaymentInfoDTO>();
            CreateMap<PaymentInfoDTO, PaymentInfo>().ForMember(x => x.Id, y => y.Ignore());
            #endregion

            #region Promotion
            CreateMap<Promotion, PromotionDTO>();
            CreateMap<PromotionDTO, Promotion>().ForMember(x => x.Id, y => y.Ignore());
            #endregion

            #region Rating
            CreateMap<Rating, RatingDTO>();
            CreateMap<RatingDTO, Rating>().ForMember(x => x.Id, y => y.Ignore());
            #endregion

            #region Reservation
            CreateMap<Reservation, ReservationDTO>();
            CreateMap<ReservationDTO, Reservation>().ForMember(x => x.Id, y => y.Ignore());
            #endregion

            #region Tour
            CreateMap<Tour, TourDTO>();
            CreateMap<TourDTO, Tour>().ForMember(x => x.Id, y => y.Ignore());
            #endregion

            #region User
            CreateMap<User, UserDTO>();
            CreateMap<UserDTO, User>().ForMember(x => x.Id, y => y.Ignore());
            #endregion

            #region Func<t,bool>
            CreateMap<Func<AddressDTO, bool>, Func<Address, bool>>();
            #endregion
        }
    }
}
