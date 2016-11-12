package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import java.util.Date;

/**
 * Created by Octavio on 2016/10/24.
 */

public class ReservationDto {
    private int id;
    private String name;
    private Date date_created;
    private UserDto user_id;
    private TourDto tour_id;
    private OrderDto order_id;
    private boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public UserDto getUser_id() {
        return user_id;
    }

    public void setUser_id(UserDto user_id) {
        this.user_id = user_id;
    }

    public TourDto getTour_id() {
        return tour_id;
    }

    public void setTour_id(TourDto tour_id) {
        this.tour_id = tour_id;
    }

    public OrderDto getOrder_id() {
        return order_id;
    }

    public void setOrder_id(OrderDto order_id) {
        this.order_id = order_id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ReservationDto(int id, String name, Date date_created, UserDto user_id, TourDto tour_id, OrderDto order_id, boolean status) {

        this.id = id;
        this.name = name;
        this.date_created = date_created;
        this.user_id = user_id;
        this.tour_id = tour_id;
        this.order_id = order_id;
        this.status = status;
    }
}
