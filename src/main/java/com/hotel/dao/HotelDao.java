package com.hotel.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hotel.dao.domain.Hotel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HotelDao extends BaseMapper<Hotel> {
    @Select("select * from hotel where positions = #{position}")
    Hotel getFromPosition(Integer position);


}
