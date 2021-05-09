package com.APISpring.service;

import com.APISpring.entities.TaiKhoanNV;

public interface ITaiKhoanNVService {
	TaiKhoanNV findById(String id);
	TaiKhoanNV save(TaiKhoanNV tk);
	TaiKhoanNV update(TaiKhoanNV tk);
	int delete(TaiKhoanNV tk);
}
