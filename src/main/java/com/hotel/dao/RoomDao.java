package com.hotel.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hotel.dao.domain.Room;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoomDao extends BaseMapper<Room> {

}
