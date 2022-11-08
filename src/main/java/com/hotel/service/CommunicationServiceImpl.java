package com.hotel.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotel.dao.CommunicationDao;
import com.hotel.dao.domain.Communication;
import org.springframework.stereotype.Service;

@Service
public class CommunicationServiceImpl extends ServiceImpl<CommunicationDao, Communication> implements CommunicationService {
}
