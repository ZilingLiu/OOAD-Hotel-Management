package com.hotel.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hotel.dao.domain.Communication;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommunicationDao extends BaseMapper<Communication> {
}
