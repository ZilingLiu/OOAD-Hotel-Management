package com.hotel.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hotel.dao.domain.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ManagerDao extends BaseMapper<Manager> {}
