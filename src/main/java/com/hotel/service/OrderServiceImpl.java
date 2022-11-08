package com.hotel.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotel.dao.OrderDao;
import com.hotel.dao.domain.Orders;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderDao, Orders> implements OrderService{
}
