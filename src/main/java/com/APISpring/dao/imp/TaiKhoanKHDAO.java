package com.APISpring.dao.imp;

import org.springframework.stereotype.Repository;

import com.APISpring.dao.ITaiKhoanKHDAO;
import com.APISpring.entities.TaiKhoanKH;

@Repository
public class TaiKhoanKHDAO extends AbstractDAO<TaiKhoanKH> implements ITaiKhoanKHDAO{

	@Override
	public TaiKhoanKH updateTK(TaiKhoanKH tk) {
		return update(tk);
	}

	@Override
	public TaiKhoanKH findById(String id) {
		return get("com.APISpring.entities.TaiKhoanKH", id);
	}

}
