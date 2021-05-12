package com.APISpring.service;

import java.util.Date;
import java.util.List;

import com.APISpring.entities.HoaDon;

public interface IHoaDonService {
	HoaDon autoCreate();
	HoaDon findById(String id);
	List<HoaDon> findAll();
	List<HoaDon> findByDate(Date tuNgay, Date denNgay);
	HoaDon saveHoaDon(HoaDon hoaDon);
}
