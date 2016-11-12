package com.cetys.dreamteam.musicalbroccoli.commons.dtos;

import java.util.Date;

/**
 * Created by Octavio on 2016/11/12.
 */

public class CheckpointDto {
    private int id;
    private Date start_time;
    private Date end_time;
    private AddressDto address_id;
    private TourDto tour_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public AddressDto getAddress_id() {
        return address_id;
    }

    public void setAddress_id(AddressDto address_id) {
        this.address_id = address_id;
    }

    public TourDto getTour_id() {
        return tour_id;
    }

    public void setTour_id(TourDto tour_id) {
        this.tour_id = tour_id;
    }

    public CheckpointDto(int id, Date start_time, Date end_time, AddressDto address_id, TourDto tour_id) {
        this.id = id;
        this.start_time = start_time;
        this.end_time = end_time;

        this.address_id = address_id;
        this.tour_id = tour_id;
    }
}
