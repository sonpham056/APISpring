package com.APISpring.dao;

import java.util.Date;
import java.util.List;

import com.APISpring.entities.HoaDon;

public interface IHoaDonDAO extends IGeneric<HoaDon>{
	HoaDon autoCreate();
	HoaDon findById(String id);
	List<HoaDon> findAll();
	List<HoaDon> findByDate(Date tuNgay, Date denNgay);
	HoaDon saveHoaDon(HoaDon hoaDon);
}
