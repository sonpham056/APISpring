package com.APISpring.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.APISpring.entities.TaiKhoanNV;
import com.APISpring.service.ITaiKhoanNVService;

@RestController(value = "/api/taikhoannv")
public class TaiKhoanNVAPI {
	@Autowired
	ITaiKhoanNVService service;
	
	@GetMapping(value = "/api/taikhoannv/{id}")
	public TaiKhoanNV findById(@PathVariable String id) {
		TaiKhoanNV tk = service.findById(id);
		return tk;
	}
	
	@PostMapping(value = "/api/taikhoannv")
	public TaiKhoanNV save(@RequestBody TaiKhoanNV tk) {
		return service.save(tk);
	}
	
	@DeleteMapping(value = "/api/taikhoannv")
	public int delete(@RequestBody TaiKhoanNV tk) {
		return service.delete(tk);
	}
	
	@PutMapping(value = "/api/taikhoannv")
	public TaiKhoanNV update(@RequestBody TaiKhoanNV tk) {
		return service.update(tk);
	}
}
