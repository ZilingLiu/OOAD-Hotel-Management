package com.hotel.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotel.dao.RoomDao;
import com.hotel.dao.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl extends ServiceImpl<RoomDao, Room> implements RoomService {
    @Autowired
    private RoomDao roomDao;




}
