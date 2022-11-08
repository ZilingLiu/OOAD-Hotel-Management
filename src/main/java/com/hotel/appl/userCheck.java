package com.hotel.appl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hotel.dao.domain.Consumer;
import com.hotel.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userCheck {
    @Autowired
    private ConsumerService consumerService;

    public Boolean logIn(String email, String password){
        QueryWrapper<Consumer> qw = new QueryWrapper<>();
        qw.eq("email",email);
        Consumer consumer;
        consumer =  consumerService.getOne(qw);
        if (consumer == null){   //没有注册过
            return false;
        }
        else if(consumer.getPassword().equals(password)){     //有用户且密码正确
            return true;
        }
        else{     //密码不正确
            return false;
        }

    }

    public Boolean register(Consumer consumer){

        consumerService.save(consumer);
        return true;
    }

}
