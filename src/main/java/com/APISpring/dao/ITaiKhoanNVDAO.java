package com.APISpring.dao;

import com.APISpring.entities.TaiKhoanNV;

public interface ITaiKhoanNVDAO extends IGeneric<TaiKhoanNV>{
	TaiKhoanNV findById(String id);
	TaiKhoanNV saveTaiKhoanNV(TaiKhoanNV tk);
	TaiKhoanNV updateTaiKhoanNV(TaiKhoanNV tk);
	int deleteTaiKhoanNV(TaiKhoanNV tk);
}
