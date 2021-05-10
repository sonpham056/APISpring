package com.APISpring.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APISpring.dao.IMonAnDAO;
import com.APISpring.entities.MonAn;
import com.APISpring.service.IMonAnService;

@Service
public class MonAnService implements IMonAnService{

	@Autowired
	IMonAnDAO monAnDAO;
	
	@Override
	public List<MonAn> findAll() {
		return monAnDAO.findAll();
	}

	@Override
	public MonAn findById(String id) {
		return monAnDAO.findById(id);
	}

	@Override
	public MonAn findByName(String name) {
		return monAnDAO.findByName(name);
	}

	@Override
	public MonAn saveMonAn(MonAn monAn) {
		return monAnDAO.saveMonAn(monAn);
	}

	@Override
	public MonAn updateMonAn(MonAn monAn) {
		return monAnDAO.updateMonAn(monAn);
	}

	@Override
	public int deleteMonAn(MonAn monAn) {
		return monAnDAO.deleteMonAn(monAn);
	}

}
