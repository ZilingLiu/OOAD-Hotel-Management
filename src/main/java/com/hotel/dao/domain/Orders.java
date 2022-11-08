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
}
