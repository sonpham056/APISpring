package com.APISpring.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APISpring.dao.ITaiKhoanKHDAO;
import com.APISpring.entities.TaiKhoanKH;
import com.APISpring.service.ITaiKhoanKHService;

@Service
public class TaiKhoanKHService implements ITaiKhoanKHService{

	@Autowired
	ITaiKhoanKHDAO taiKhoan;
	
	@Override
	public TaiKhoanKH update(TaiKhoanKH tk) {
		return taiKhoan.updateTK(tk);
	}

	@Override
	public TaiKhoanKH find(String id) {
		return taiKhoan.findById(id);
	}

}
