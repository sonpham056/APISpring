package com.APISpring.dao.imp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.APISpring.dao.INguyenLieuDAO;
import com.APISpring.entities.NguyenLieu;

@Repository
public class NguyenLieuDAO extends AbstractDAO<NguyenLieu> implements INguyenLieuDAO{

	@Override
	public NguyenLieu updateNL(NguyenLieu nl) {
		return update(nl);
	}

	@Override
	public NguyenLieu saveNL(NguyenLieu nl) {
		return save(nl);
	}

	@Override
	public NguyenLieu findById(String ma) {
		return get("com.APISpring.entities.NguyenLieu", ma);
	}

	@Override
	public List<NguyenLieu> findAllNL() {
		return getAll("NguyenLieu");
	}

}
