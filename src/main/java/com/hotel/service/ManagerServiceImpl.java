package com.hotel.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotel.dao.ManagerDao;
import com.hotel.dao.domain.Manager;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl extends ServiceImpl<ManagerDao, Manager> implements ManagerService {
}
