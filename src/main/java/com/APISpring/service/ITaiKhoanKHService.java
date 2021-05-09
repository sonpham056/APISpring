package com.APISpring.service;

import com.APISpring.entities.TaiKhoanKH;

public interface ITaiKhoanKHService {
	TaiKhoanKH update(TaiKhoanKH tk);
	TaiKhoanKH find(String id);
}
