package com.APISpring.dao;

import java.util.List;

import com.APISpring.entities.LoaiMonAn;

public interface ILoaiMonAnDAO extends IGeneric<LoaiMonAn>{
	LoaiMonAn saveLoaiMonAn(LoaiMonAn l);
	LoaiMonAn updateLoaiMonAn(LoaiMonAn l);
	int deleteLoaiMonAn(LoaiMonAn l);
	<T> List<T> getAllLoaiMonAn();
	<T> LoaiMonAn getLoaiMonAn(String id);
}
