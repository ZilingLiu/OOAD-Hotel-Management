package com.hotel.dao.domain;

import lombok.Data;

@Data
public class Consumer {
    private String consumerName;
    private String password;
    private String email;
    private Integer balance;

}
