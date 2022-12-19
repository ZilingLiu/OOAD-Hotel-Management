package com.hotel.dao.domain;
import java.sql.Date;
import lombok.Data;

@Data
public class Hotel {
    private Integer id;
    private String hotelName;
    private String city;
    private Integer positions;
}
