package com.hotel.dao.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Communication {
    private String author;
    private String consumer;
    private String manager;
    private String contents;
    private Date time;

}
