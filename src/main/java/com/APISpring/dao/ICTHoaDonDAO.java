package com.APISpring.dao;

import java.util.List;

import com.APISpring.entities.CTHoaDon;
import com.APISpring.entities.HoaDon;

public interface ICTHoaDonDAO extends IGeneric<CTHoaDon>{
	CTHoaDon saveHD(CTHoaDon cthd);
	List<CTHoaDon> findAllHD(HoaDon hd);
}
