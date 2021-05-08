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

import com.APISpring.entities.LoaiMonAn;
import com.APISpring.service.ILoaiMonAnService;

@RestController(value = "/api/loaimonan")
public class LoaiMonAnAPI {

	@Autowired
	ILoaiMonAnService loaiMonAnService;

	@PostMapping(value = "api/loaimonan")
	public LoaiMonAn createLoaiMonAn(@RequestBody LoaiMonAn loaiMonAn) {
		return loaiMonAnService.save(loaiMonAn);
	}

	@PutMapping(value = "api/loaimonan")
	public LoaiMonAn updateLoaiMonAn(@RequestBody LoaiMonAn loaiMonAn) {
		return loaiMonAnService.update(loaiMonAn);
	}

	@DeleteMapping(value = "api/loaimonan")
	public int deleteLoaiMonAn(@RequestBody LoaiMonAn loaiMonAn) {
		return loaiMonAnService.delete(loaiMonAn);
	}

	@GetMapping(value = "api/loaimonan")
	public List<LoaiMonAn> getLoaiMonAn() {
		return loaiMonAnService.getAll();
	}
	
	
	@GetMapping(value = "api/loaimonan/{id}")
	public LoaiMonAn findById(@PathVariable String id) {
		return loaiMonAnService.get(id);
	}
}
