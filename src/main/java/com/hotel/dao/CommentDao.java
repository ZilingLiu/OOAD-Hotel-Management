package com.hotel.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hotel.dao.domain.Comment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentDao extends BaseMapper<Comment> {

}
