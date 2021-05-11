package com.APISpring.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APISpring.dao.ILoaiKhachHangDAO;
import com.APISpring.entities.LoaiKhachHang;
import com.APISpring.service.ILoaiKhachHangService;

@Service
public class LoaiKhachHangService implements ILoaiKhachHangService{

	@Autowired
	ILoaiKhachHangDAO loaiKhachHang;
	
	@Override
	public LoaiKhachHang find(String id) {
		return loaiKhachHang.findById(id);
	}

}
