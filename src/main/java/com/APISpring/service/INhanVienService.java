package com.APISpring.service;

import java.util.List;

import com.APISpring.entities.NhanVien;

public interface INhanVienService {
	NhanVien findById(String maNV);
	List<NhanVien> findAll();
	NhanVien save(NhanVien nhanVien);
	NhanVien update(NhanVien nhanVien);
	int delete(NhanVien nhanVien);
}
