package com.APISpring.dao.imp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.APISpring.dao.ILoaiMonAnDAO;
import com.APISpring.entities.LoaiMonAn;



@Repository
public class LoaiMonAnDAO extends AbstractDAO<LoaiMonAn> implements ILoaiMonAnDAO{

	@Override
	public LoaiMonAn saveLoaiMonAn(LoaiMonAn l) {
		return save(l);
	}

	@Override
	public LoaiMonAn updateLoaiMonAn(LoaiMonAn l) {
		return update(l);
	}

	@Override
	public int deleteLoaiMonAn(LoaiMonAn l) {
		return delete(l);
	}

	@Override
	public <T> List<T> getAllLoaiMonAn() {
		return getAll();
	}

	@Override
	public <T> LoaiMonAn getLoaiMonAn(String id) {
		return get("com.APISpring.entities.LoaiMonAn", id);
	}
	
}
