package com.hotel.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hotel.dao.HotelDao;
import com.hotel.dao.domain.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl extends ServiceImpl<HotelDao, Hotel> implements HotelService{
    @Autowired
    private HotelDao hotelDao;

    @Override
    public Boolean modify(Hotel hotel) {
        return hotelDao.updateById(hotel) > 0;
    }

    @Override
    public IPage<Hotel> getPage( int currentPage, int PageSize) {
        IPage page = new Page(currentPage,PageSize);
        hotelDao.selectPage(page, null);
        return page;
    }
//    @Override
//    public boolean save(Hotel hotel) {
//        return hotelDao.insert(hotel) > 0;
//    }
//
//    @Override
//    public Boolean update(Hotel hotel) {
//        return hotelDao.updateById(hotel) > 0;
//    }
//
//    @Override
//    public Boolean delete(Integer id) {
//        return hotelDao.deleteById(id) > 0;
//    }
//
//    @Override
//    public Hotel getById(Integer id) {
//        return hotelDao.selectById(id);
//    }
//
//    @Override
//    public List<Hotel> getAll() {
//        return hotelDao.selectList(null);
//    }

}
