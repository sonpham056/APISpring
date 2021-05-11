package com.APISpring.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.APISpring.entities.LoaiKhachHang;
import com.APISpring.service.ILoaiKhachHangService;

@RestController(value = "/api/loaikhachhang")
public class LoaiKhachHangAPI {
	@Autowired
	ILoaiKhachHangService loaiKhachHangService;
	
	@GetMapping(value = "/api/loaikhachhang/{id}")
	public LoaiKhachHang findLoaiKH(@PathVariable String id) {
		return loaiKhachHangService.find(id);
	}
}
