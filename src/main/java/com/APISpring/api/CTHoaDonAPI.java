package com.APISpring.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.APISpring.entities.CTHoaDon;
import com.APISpring.entities.HoaDon;
import com.APISpring.service.ICTHoaDonService;

@RestController(value = "/api/cthoadon")
public class CTHoaDonAPI {
	
	@Autowired
	ICTHoaDonService ctHD;
	
	@PostMapping(value = "/api/cthoadon")
	CTHoaDon saveHD(@RequestBody CTHoaDon cthd) {
		return ctHD.save(cthd);
	}
	
	@GetMapping(value = "/api/cthoadon")
	List<CTHoaDon> findAll(@RequestBody HoaDon hd){
		return ctHD.findAll(hd);
	}
}
