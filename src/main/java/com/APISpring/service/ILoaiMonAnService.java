package com.APISpring.service;

import java.util.List;

import com.APISpring.entities.LoaiMonAn;



public interface ILoaiMonAnService {
	LoaiMonAn save(LoaiMonAn loaiMonAn);
	LoaiMonAn update(LoaiMonAn loaiMonAn);
	int delete(LoaiMonAn loaiMonAn);
	List<LoaiMonAn> getAll();
	LoaiMonAn get(String id);
}
