package com.APISpring.dao;

import java.util.List;

import com.APISpring.entities.MonAn;

public interface IMonAnDAO {
	List<MonAn> findAll();
	MonAn findById(String id);
	MonAn findByName(String name);
	MonAn saveMonAn(MonAn monAn);
	MonAn updateMonAn(MonAn monAn);
	int deleteMonAn(MonAn monAn);
}
