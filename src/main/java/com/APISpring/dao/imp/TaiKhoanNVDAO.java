package com.APISpring.dao.imp;

import org.springframework.stereotype.Repository;

import com.APISpring.dao.ITaiKhoanNVDAO;
import com.APISpring.entities.TaiKhoanNV;

@Repository
public class TaiKhoanNVDAO extends AbstractDAO<TaiKhoanNV> implements ITaiKhoanNVDAO{

	@Override
	public TaiKhoanNV findById(String id) {
		return get("com.APISpring.entities.TaiKhoanNV", id);
	}

	@Override
	public TaiKhoanNV saveTaiKhoanNV(TaiKhoanNV tk) {
		return save(tk);
	}

	@Override
	public int deleteTaiKhoanNV(TaiKhoanNV tk) {
		return delete(tk);
	}

	@Override
	public TaiKhoanNV updateTaiKhoanNV(TaiKhoanNV tk) {
		return update(tk);
	}

}
