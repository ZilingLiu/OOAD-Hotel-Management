package com.hotel.dao.domain;

import lombok.Data;

@Data
public class Room {
    private Integer id;
    private String hotelName;
    private Integer roomNumber;
    private String roomType;
    private Integer price;
    private String introduction;
}
