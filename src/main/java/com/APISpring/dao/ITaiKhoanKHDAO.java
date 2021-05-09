package com.APISpring.dao;

import com.APISpring.entities.TaiKhoanKH;

public interface ITaiKhoanKHDAO extends IGeneric<TaiKhoanKH> {
	TaiKhoanKH updateTK(TaiKhoanKH tk);
	TaiKhoanKH findById(String id);
}
