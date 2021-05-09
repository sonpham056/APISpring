package com.APISpring.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APISpring.dao.INhanVienDAO;
import com.APISpring.entities.NhanVien;
import com.APISpring.service.INhanVienService;

@Service
public class NhanVienService implements INhanVienService{

	@Autowired
	private INhanVienDAO nhanVienDAO;
	
	@Override
	public NhanVien findById(String maNV) {
		return nhanVienDAO.findById(maNV);
	}

}
