package com.hotel.dao.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Communication implements Comparable{
    private String author;
    private String consumer;
    private String manager;
    private String contents;
    private Date time;
    private int index;

    //    public Communication(){
//
//    }
//
//    public Communication(String author, String consumer, String manager, String contents, Date date){
//        this.author = author;
//        this.consumer = consumer;
//        this.manager = manager;
//        this.contents = contents;
//        this.time = date;
//    }
    @Override
    public int compareTo(Object o) {
        if (o instanceof Communication){
            return this.time.compareTo(((Communication) o).time);
        }
        return 0;
    }
}
