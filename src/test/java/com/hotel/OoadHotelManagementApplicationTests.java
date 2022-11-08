package com.hotel;

import com.hotel.dao.HotelDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OoadHotelManagementApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private HotelDao hotelDao;


	@Test
	void testGet(){
		hotelDao.selectList(null);
	}

}
