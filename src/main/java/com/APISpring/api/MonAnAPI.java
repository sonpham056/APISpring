package com.APISpring.api;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.APISpring.entities.MonAn;
import com.APISpring.service.IMonAnService;

@RestController(value = "/api/monan")
public class MonAnAPI {
	@Autowired
	IMonAnService monAnService;
	
	@GetMapping(value = "/api/monan")
	public List<MonAn> findAll(){
		return monAnService.findAll();
	}
	
	@GetMapping(value = "/api/monan/id/{id}")
	public MonAn findById(@PathVariable String id) {
		return monAnService.findById(id);
	}
	
	@GetMapping(value = "/api/monan/name/{name}")
	public MonAn findByName(@PathVariable String name) {
		try {
			name = URLDecoder.decode(name, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return monAnService.findByName(name);
	}
	
	@PostMapping(value = "/api/monan")
	public MonAn saveMonAn(@RequestBody MonAn monAn) {
		return monAnService.saveMonAn(monAn);
	}
	
	@PutMapping(value = "/api/monan")
	public MonAn updateMonAn(@RequestBody MonAn monAn) {
		System.out.println(monAn.getMaMA() + "/" + monAn.getTenMA());
		return monAnService.updateMonAn(monAn);
	}
	
	@DeleteMapping(value = "/api/monan")
	public int deleteMonAn(@RequestBody MonAn monAn) {
		return monAnService.deleteMonAn(monAn);
	}
}
