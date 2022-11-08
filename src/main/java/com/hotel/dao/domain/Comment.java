package com.hotel.dao.domain;

import lombok.Data;

import java.util.Date;


@Data
public class Comment {
    private Integer id;
    private Integer OrderId;
    private Integer score;
    private String contents;
    private Date date;

}
