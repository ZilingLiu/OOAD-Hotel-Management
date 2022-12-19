package com.hotel.dao.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Orders {
    private Integer id;
    private String consumerName;
    private String hotelName;
    private Integer roomNumber;
    private Date startTime;
    private Date endTime;
    private Integer price;

    private String roomType;
    private String comments;
    private Integer star;
    private boolean paid;
    private String liver;
    private String phone;
    private String pic;


    public Orders(String consumerName, String hotelName, Integer roomNumber, Date startTime, Date endTime,
                  Integer price, String roomType,String liver, String phone) {
        this.consumerName = consumerName;
        this.hotelName = hotelName;
        this.roomNumber = roomNumber;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
        this.roomType = roomType;
        this.comments = null;
        this.star = null;
        this.paid = false;
        this.liver = liver;
        this.phone = phone;
    }

    public Orders (){

    }



}
