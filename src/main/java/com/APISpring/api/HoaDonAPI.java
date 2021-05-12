package com.APISpring.api;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.APISpring.entities.HoaDon;
import com.APISpring.service.IHoaDonService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController(value = "/api/hoadon")
public class HoaDonAPI {
	
	@Autowired
	IHoaDonService hoaDonService;
	
	@GetMapping(value = "/api/hoadon/autocreate")
	HoaDon autoCreate() {
		return hoaDonService.autoCreate();
	}
	
	@GetMapping(value = "/api/hoadon/id/{id}")
	HoaDon findById(@PathVariable String id) {
		return hoaDonService.findById(id);
	}
	
	@GetMapping(value = "/api/hoadon")
	List<HoaDon> findAll(){
		return hoaDonService.findAll();
	}
	
	@GetMapping(value = "/api/hoadon/date/{day1}/{day2}")
	List<HoaDon> findByDate(@PathVariable String day1, @PathVariable String day2){
		Date tuNgay = null;
		Date denNgay = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			tuNgay = mapper.readValue(day1, Date.class);
			denNgay = mapper.readValue(day2, Date.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return hoaDonService.findByDate(tuNgay, denNgay);
	}
	
	@PostMapping(value = "/api/hoadon")
	HoaDon saveHoaDon(@RequestBody HoaDon hoaDon) {
		return hoaDonService.saveHoaDon(hoaDon);
	}
}
