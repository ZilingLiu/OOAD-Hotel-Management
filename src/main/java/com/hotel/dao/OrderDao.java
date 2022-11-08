package com.hotel.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hotel.dao.domain.Orders;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface OrderDao extends BaseMapper<Orders> {

}
