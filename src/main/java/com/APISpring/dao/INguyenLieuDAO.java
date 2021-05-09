package com.APISpring.dao;

import java.util.List;

import com.APISpring.entities.NguyenLieu;

public interface INguyenLieuDAO extends IGeneric<NguyenLieu> {
	NguyenLieu updateNL(NguyenLieu nl);
	NguyenLieu createNL(NguyenLieu nl);
	NguyenLieu findByNL(String ma);
	List<NguyenLieu> findAllNL();
}
