package com.hotel.appl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hotel.dao.domain.Consumer;
import com.hotel.dao.domain.Manager;
import com.hotel.service.ConsumerService;
import com.hotel.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCheck {
    @Autowired
    private ConsumerService consumerService;

    @Autowired
    private ManagerService managerService;

    public Consumer logIn(String email, String password){
        QueryWrapper<Consumer> qw = new QueryWrapper<>();
        qw.eq("email",email);
        qw.eq("password",password);
        Consumer consumer;
        consumer =  consumerService.getOne(qw);
        if (consumer == null){   //没有注册过
            return null;
        }
        else if(consumer.getPassword().equals(password)){     //有用户且密码正确
            return consumer;
        }
        else{     //密码不正确
            return null;
        }

    }

    public Manager managerlogIn(String email, String password){
        QueryWrapper<Manager> qw = new QueryWrapper<>();
        qw.eq("email",email);
        qw.eq("passwords",password);
        Manager manager;
        manager =  managerService.getOne(qw);
        if (manager == null){   //没有注册过
            return null;
        }
        else if(manager.getPasswords().equals(password)){     //有用户且密码正确
            return manager;
        }
        else{     //密码不正确
            return null;
        }

    }

    public Boolean consumerRegister(Consumer consumer){

        consumerService.save(consumer);
//        UpdateWrapper<Consumer>uw = new UpdateWrapper<>();
//        uw.set("balance",1000);
//        uw.eq("consumer_name","张三");
//
//        consumerService.update(uw);

        return true;
    }
    public Boolean managerRegister(Manager manager){
        managerService.save(manager);
        return true;
    }



}
