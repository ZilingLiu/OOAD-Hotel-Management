package com.hotel.dao.domain;

import lombok.Data;

@Data
public class Consumer {
    private String consumerName;
    private String password;
    private String email;
    private Integer balance;
    private Integer userPoints;

    public Consumer(String consumerName, String password, String email) {
        this.consumerName = consumerName;
        this.password = password;
        this.email = email;
        this.balance = 0;
    }
}
