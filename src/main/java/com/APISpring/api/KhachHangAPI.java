package com.APISpring.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.APISpring.entities.KhachHang;
import com.APISpring.service.IKhachHangService;

@RestController(value = "/api/khachhang")
public class KhachHangAPI {
	@Autowired
	IKhachHangService khachHangService;
	
	@GetMapping(value = "/api/khachhang/id/{id}")
	public KhachHang findKHById(@PathVariable String id) {
		return khachHangService.findId(id);
	}
	
	@GetMapping(value = "/api/khachhang/sdt/{sdt}")
	public KhachHang findKHBySdt(@PathVariable Long sdt) {
		return khachHangService.findSdt(sdt);
	}
	
	@GetMapping(value = "/api/khachhang")
	public List<KhachHang> findAllKH(){
		return khachHangService.findAll();
	}
	
	@PutMapping(value = "/api/khachhang")
	public KhachHang updateKH(@RequestBody KhachHang kh) {
		return khachHangService.update(kh);
	}
}
