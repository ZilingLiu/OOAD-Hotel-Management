package com.hotel.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hotel.dao.domain.Manager;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManagerDao extends BaseMapper<Manager> {
}
