package com.APISpring.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APISpring.dao.ICTHoaDonDAO;
import com.APISpring.entities.CTHoaDon;
import com.APISpring.entities.HoaDon;
import com.APISpring.service.ICTHoaDonService;

@Service
public class CTHoaDonService implements ICTHoaDonService{
	
	@Autowired
	ICTHoaDonDAO ctHD;
	
	@Override
	public CTHoaDon save(CTHoaDon cthd) {
		return ctHD.saveHD(cthd);
	}

	@Override
	public List<CTHoaDon> findAll(HoaDon hd) {
		return ctHD.findAllHD(hd);
	}

	
	
}
