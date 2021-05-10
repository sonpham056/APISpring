package com.APISpring.service;

import java.util.List;

import com.APISpring.entities.MonAn;

public interface IMonAnService {
	List<MonAn> findAll();
	MonAn findById(String id);
	MonAn findByName(String name);
	MonAn saveMonAn(MonAn monAn);
	MonAn updateMonAn(MonAn monAn);
	int deleteMonAn(MonAn monAn);
}
