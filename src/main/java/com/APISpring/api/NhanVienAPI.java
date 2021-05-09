package com.APISpring.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.APISpring.entities.NhanVien;
import com.APISpring.service.INhanVienService;

@RestController(value = "/api/nhanvien")
public class NhanVienAPI {
	
	@Autowired
	INhanVienService nhanVienService;
	
	@GetMapping(value = "/api/nhanvien/{id}")
	public NhanVien findById(@PathVariable String id) {
		return nhanVienService.findById(id);
	}
	
	@GetMapping(value = "/api/nhanvien")
	public List<NhanVien> findAll(){
		return nhanVienService.findAll();
	}
	
	@PostMapping(value = "/api/nhanvien")
	public NhanVien save(@RequestBody NhanVien nhanVien) {
		return nhanVienService.save(nhanVien);
	}
	
	@PutMapping(value = "/api/nhanvien")
	public NhanVien update(@RequestBody NhanVien nhanVien) {
		return nhanVienService.update(nhanVien);
	}
	
	@DeleteMapping(value = "/api/nhanvien")
	public int delete(@RequestBody NhanVien nhanVien) {
		return nhanVienService.delete(nhanVien);
	}
}
