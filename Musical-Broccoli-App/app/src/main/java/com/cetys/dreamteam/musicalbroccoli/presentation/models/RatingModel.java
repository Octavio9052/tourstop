package com.cetys.dreamteam.musicalbroccoli.presentation.models;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by Octavio on 2016/11/12.
 */

public class RatingModel extends BaseModel {
    private ObservableInt id;
    private ObservableInt ratingValue;
    private ObservableField<String> comment;
    private ObservableInt userId;
    private ObservableInt tourId;

    public void setId(int id){
        if(this.id == null)
            this.id = new ObservableInt(id);
        else
            this.id.set(id);
    }

    public int getId(){
        return id.get();
    }

    public void setRatingValue(int ratingValue){
        if(this.ratingValue == null)
            this.ratingValue = new ObservableInt(ratingValue);
        else
            this.ratingValue.set(ratingValue);
    }

    public int getRatingValue(){
        return ratingValue.get();
    }

    public void setComment(String comment){
        if(this.comment == null)
            this.comment = new ObservableField<>(comment);
        else
            this.comment.set(comment);
    }

    public String getComment(){
        return comment.get();
    }

    public void setUserId(int userId){
        if(this.userId == null)
            this.userId = new ObservableInt(userId);
        else
            this.userId.set(userId);
    }

    public int getUserId(){
        return userId.get();
    }

    public void setTourId(int tourId){
        if(this.tourId == null)
            this.tourId = new ObservableInt(tourId);
        else
            this.tourId.set(tourId);
    }

    public int getTourId(){
        return tourId.get();
    }
}
