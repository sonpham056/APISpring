package com.APISpring.dao;

import java.util.List;

import com.APISpring.entities.NhanVien;

public interface INhanVienDAO extends IGeneric<NhanVien>{
	NhanVien findById(String maNV);
	List<NhanVien> findAll();
	NhanVien saveNhanVien(NhanVien nhanVien);
	NhanVien updateNhanVien(NhanVien nhanVien);
	int deleteNhanVien(NhanVien nhanVien);
}
