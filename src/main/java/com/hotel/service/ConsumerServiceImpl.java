package com.hotel.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotel.dao.ConsumerDao;
import com.hotel.dao.domain.Consumer;
import org.springframework.stereotype.Service;


@Service
public class ConsumerServiceImpl extends ServiceImpl<ConsumerDao, Consumer> implements ConsumerService{


}
