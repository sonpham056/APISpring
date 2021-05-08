package com.APISpring.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APISpring.dao.ILoaiMonAnDAO;
import com.APISpring.entities.LoaiMonAn;
import com.APISpring.service.ILoaiMonAnService;

@Service
public class LoaiMonAnService implements ILoaiMonAnService{

	@Autowired
	ILoaiMonAnDAO loaiMonAn;
	
	@Override
	public LoaiMonAn save(LoaiMonAn l) {
		return loaiMonAn.saveLoaiMonAn(l);
	}

	@Override
	public LoaiMonAn update(LoaiMonAn l) {
		return loaiMonAn.updateLoaiMonAn(l);
	}

	@Override
	public int delete(LoaiMonAn l) {
		return loaiMonAn.deleteLoaiMonAn(l);
	}

	@Override
	public List<LoaiMonAn> getAll() {
		return loaiMonAn.getAllLoaiMonAn();
	}

	@Override
	public LoaiMonAn get(String id) {
		return loaiMonAn.getLoaiMonAn(id);
	}

}
