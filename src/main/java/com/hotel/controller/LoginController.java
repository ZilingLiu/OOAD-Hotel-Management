package com.hotel.controller;


import com.hotel.appl.userCheck;
import com.hotel.controller.utils.R;
import com.hotel.dao.domain.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/firstPage")
public class LoginController {

    @Autowired
    private userCheck userCheck;



    @GetMapping("{email}/{password}")
    public R logIn(@PathVariable String email, @PathVariable String password){
        return  new R(userCheck.logIn(email,password));
    }

    @PostMapping("/register")
    public R logOn(@RequestBody Consumer consumer){
        return new R(userCheck.register(consumer));
    }
}
