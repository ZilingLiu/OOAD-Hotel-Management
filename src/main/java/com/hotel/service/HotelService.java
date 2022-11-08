package com.hotel.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hotel.dao.domain.Hotel;

import java.util.List;


public interface HotelService extends IService<Hotel> {
//    Boolean save(Hotel hotel);
        Boolean modify(Hotel hotel);
//        boolean save(Hotel hotel);
//
//        Boolean update(Hotel hotel);
        IPage<Hotel> getPage(int currentPage, int PageSize);
//
//        Boolean delete(Integer id);
//
//        Hotel getById(Integer id);
//
//        List<Hotel> getAll();




}
