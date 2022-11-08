package com.hotel.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotel.dao.CommentDao;
import com.hotel.dao.domain.Comment;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl extends ServiceImpl<CommentDao, Comment> implements CommentService{
}
