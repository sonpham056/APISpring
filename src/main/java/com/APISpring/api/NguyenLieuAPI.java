package com.APISpring.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.APISpring.entities.NguyenLieu;
import com.APISpring.service.INguyenLieuService;

@RestController(value = "/api/nguyenlieu")
public class NguyenLieuAPI {

	@Autowired
	INguyenLieuService nguyenLieuService;
	
	@PutMapping(value = "/api/nguyenlieu")
	public NguyenLieu updateNL(@RequestBody NguyenLieu nl) {
		return nguyenLieuService.update(nl);
	}
	
	@PostMapping(value = "/api/nguyenlieu")
	public NguyenLieu createNL(@RequestBody NguyenLieu nl) {
		return nguyenLieuService.create(nl);
	}
	
	@GetMapping(value = "/api/nguyenlieu/{id}")
	public NguyenLieu findNL(@PathVariable String ma) {
		return nguyenLieuService.find(ma);
	}
	
	@GetMapping(value = "/api/nguyenlieu")
	public List<NguyenLieu> findAll(){
		return nguyenLieuService.findAll();
	}
	
}
