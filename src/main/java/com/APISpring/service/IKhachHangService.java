package com.APISpring.service;

import java.util.List;

import com.APISpring.entities.KhachHang;

public interface IKhachHangService {
	KhachHang findId(String id);
	KhachHang findSdt(Long sdt);
	List<KhachHang> findAll();
	KhachHang update(KhachHang kh);
}
