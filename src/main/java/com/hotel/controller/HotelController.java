package com.hotel.controller;

import com.hotel.controller.utils.R;
import com.hotel.dao.domain.Hotel;
import com.hotel.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @Autowired
    private RoomService roomService;


    @Autowired
    private OrderService orderService;

    @Autowired
    private ConsumerService consumerService;

    @Autowired
    private CommunicationService communicationService;





    @GetMapping("selectHotel/{id}")
    public R getById(@PathVariable int id){


        return new R(true,hotelService.getById(id));
    }

    @GetMapping
    public R getAll(){
        return new R(true,roomService.list());
    }
    @PostMapping
    public R save(@RequestBody Hotel hotel){
        return new R(hotelService.save(hotel));

    }
    @PutMapping
    public R update(@RequestBody Hotel hotel){
        return new R(hotelService.modify(hotel));
    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(hotelService.removeById(id));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize){
        return new R(true,hotelService.getPage(currentPage, pageSize));

    }

    @RequestMapping("/rooms")
    public R getAllRooms(){
        return new R(true,roomService.list());
    }

    @RequestMapping("/consumers")
    public R getAllConsumers(){
        return new R(true, consumerService.list());
    }
    @RequestMapping("/orders")
    public R getAllOrders(){
        return new R(true, orderService.list());
    }
    @RequestMapping("/communication")
    public R getAllCom(){
        return new R(true, communicationService.list());
    }


}
