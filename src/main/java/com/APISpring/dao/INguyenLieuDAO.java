package com.APISpring.dao;

import java.util.List;

import com.APISpring.entities.NguyenLieu;

public interface INguyenLieuDAO extends IGeneric<NguyenLieu> {
	NguyenLieu updateNL(NguyenLieu nl);
	NguyenLieu saveNL(NguyenLieu nl);
	NguyenLieu findById(String ma);
	List<NguyenLieu> findAllNL();
}
