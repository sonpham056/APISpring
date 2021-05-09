package com.APISpring.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.APISpring.entities.TaiKhoanKH;
import com.APISpring.service.ITaiKhoanKHService;

@RestController(value = "/api/taikhoankh")
public class TaiKhoanKHAPI {
	
	@Autowired
	ITaiKhoanKHService taiKhoan;
	
	@PutMapping(value = "/api/taikhoankh")
	public TaiKhoanKH update(@RequestBody TaiKhoanKH tk) {
		return taiKhoan.update(tk);
	}
	
	@GetMapping(value = "/api/taikhoankh/{id}")
	public TaiKhoanKH find(@PathVariable String id) {
		return taiKhoan.find(id);
	}
	
}
