package com.APISpring.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APISpring.dao.IKhachHangDAO;
import com.APISpring.entities.KhachHang;
import com.APISpring.service.IKhachHangService;

@Service
public class KhachHangService implements IKhachHangService{

	@Autowired
	IKhachHangDAO khachHang;
	
	@Override
	public KhachHang findId(String id) {
		return khachHang.findById(id);
	}

	@Override
	public KhachHang findSdt(Long sdt) {
		return khachHang.findBySdt(sdt);
	}

	@Override
	public List<KhachHang> findAll() {
		return khachHang.findAllKH();
	}

	@Override
	public KhachHang update(KhachHang kh) {
		return khachHang.updateKH(kh);
	}
	
}
