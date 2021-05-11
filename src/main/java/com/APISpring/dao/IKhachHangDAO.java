package com.APISpring.dao;

import java.util.List;

import com.APISpring.entities.KhachHang;

public interface IKhachHangDAO extends IGeneric<KhachHang>{
	KhachHang findById(String id);
	KhachHang findBySdt(Long sdt);
	List<KhachHang> findAllKH();
	KhachHang updateKH(KhachHang kh);
}
