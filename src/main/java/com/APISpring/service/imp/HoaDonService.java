package com.APISpring.service.imp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APISpring.dao.IHoaDonDAO;
import com.APISpring.entities.HoaDon;
import com.APISpring.service.IHoaDonService;

@Service
public class HoaDonService implements IHoaDonService{

	@Autowired
	IHoaDonDAO hoaDonDAO;
	
	@Override
	public HoaDon autoCreate() {
		return hoaDonDAO.autoCreate();
	}

	@Override
	public HoaDon findById(String id) {
		return hoaDonDAO.findById(id);
	}

	@Override
	public List<HoaDon> findAll() {
		return hoaDonDAO.findAll();
	}

	@Override
	public List<HoaDon> findByDate(Date tuNgay, Date denNgay) {
		return hoaDonDAO.findByDate(tuNgay, denNgay);
	}

	@Override
	public HoaDon saveHoaDon(HoaDon hoaDon) {
		return hoaDonDAO.saveHoaDon(hoaDon);
	}

}
