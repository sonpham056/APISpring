package com.APISpring.dao;

import com.APISpring.entities.LoaiKhachHang;

public interface ILoaiKhachHangDAO extends IGeneric<LoaiKhachHang>{
	LoaiKhachHang findById(String id);
}
