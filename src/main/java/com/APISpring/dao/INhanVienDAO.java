package com.APISpring.dao;

import com.APISpring.entities.NhanVien;

public interface INhanVienDAO extends IGeneric<NhanVien>{
	NhanVien findById(String maNV);
}
