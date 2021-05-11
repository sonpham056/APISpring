package com.APISpring.dao.imp;

import org.springframework.stereotype.Repository;

import com.APISpring.dao.ILoaiKhachHangDAO;
import com.APISpring.entities.LoaiKhachHang;

@Repository
public class LoaiKhachHangDAO extends AbstractDAO<LoaiKhachHang> implements ILoaiKhachHangDAO{
	
	@Override
	public LoaiKhachHang findById(String id) {
		return get("com.APISpring.entities.LoaiKhachHang", id);
	}
	
}
