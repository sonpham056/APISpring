package com.APISpring.api;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.APISpring.entities.BangChamCong;
import com.APISpring.service.IBangChamCongService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController(value = "/api/bangchamcong")
public class BangChamCongAPI {
	
	@Autowired
	IBangChamCongService bCCService;
	
	@GetMapping(value = "/api/bangchamcong")
	public List<BangChamCong> findAll(){
		return bCCService.findAll();
	}
	
	@PostMapping(value = "/api/bangchamcong")
	public BangChamCong save(@RequestBody BangChamCong bcc) {
		return bCCService.save(bcc);
	}
	
	@GetMapping(value = "/api/bangchamcong/{id}")
	public BangChamCong findByNVId(@PathVariable String id) {
		return bCCService.findByNVId(id);
	}
	
	@GetMapping(value = "/api/bangchamcong/{day1}/{day2}/{id}")
	public List<BangChamCong> findByDateAndId(@PathVariable String day1, @PathVariable String day2, @PathVariable String id) {
		Date tuNgay = null;
		Date denNgay = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			tuNgay = mapper.readValue(day1, Date.class);
			denNgay = mapper.readValue(day2, Date.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bCCService.findByDateAndId(tuNgay, denNgay, id);
	}
	
	@GetMapping(value = "/api/bangchamcong/{day1}/{day2}")
	public List<BangChamCong> findByDate(@PathVariable String day1, @PathVariable String day2) {
		Date tuNgay = null;
		Date denNgay = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			tuNgay = mapper.readValue(day1, Date.class);
			denNgay = mapper.readValue(day2, Date.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bCCService.findByDate(tuNgay, denNgay);
	}
	
	@PutMapping(value = "/api/bangchamcong")
	public BangChamCong update(@RequestBody BangChamCong bcc) {
		return bCCService.update(bcc);
	}
}
