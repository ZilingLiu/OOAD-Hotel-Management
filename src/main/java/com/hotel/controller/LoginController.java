package com.hotel.controller;
import com.hotel.appl.UserCheck;
import com.hotel.controller.utils.R;
import com.hotel.dao.domain.Consumer;
import com.hotel.dao.domain.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/firstPage")
public class LoginController {

    @Autowired
    private UserCheck userCheck;

    @GetMapping("{email}/{password}")
    public R logIn(@PathVariable String email, @PathVariable String password){
        return  new R(true,userCheck.logIn(email,password));
    }

    @PostMapping("/consumerRegister")
    public R logOn(@RequestBody Consumer consumer){
        return new R(userCheck.consumerRegister(consumer));
    }
    @PostMapping("/managerRegister")
    public R managerlogOn(@RequestBody Manager manager){
        return new R(userCheck.managerRegister(manager));
    }
}
