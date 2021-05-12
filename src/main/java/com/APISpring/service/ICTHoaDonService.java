package com.APISpring.service;

import java.util.List;

import com.APISpring.entities.CTHoaDon;
import com.APISpring.entities.HoaDon;

public interface ICTHoaDonService {
	public CTHoaDon save(CTHoaDon cthd);
	public List<CTHoaDon> findAll(HoaDon hd);
}
