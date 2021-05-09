package com.APISpring.service;

import java.util.List;

import com.APISpring.entities.NguyenLieu;

public interface INguyenLieuService {
	NguyenLieu update(NguyenLieu nl);
	NguyenLieu create(NguyenLieu nl);
	NguyenLieu find(String ma);
	List<NguyenLieu> findAll();
}
