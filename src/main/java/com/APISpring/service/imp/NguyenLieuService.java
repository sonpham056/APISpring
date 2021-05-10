package com.APISpring.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APISpring.dao.INguyenLieuDAO;
import com.APISpring.entities.NguyenLieu;
import com.APISpring.service.INguyenLieuService;

@Service
public class NguyenLieuService implements INguyenLieuService {

	@Autowired
	INguyenLieuDAO nguyenLieu;
	
	@Override
	public NguyenLieu update(NguyenLieu nl) {
		return nguyenLieu.updateNL(nl);
	}

	@Override
	public NguyenLieu create(NguyenLieu nl) {
		return nguyenLieu.saveNL(nl);
	}

	@Override
	public NguyenLieu find(String ma) {
		return nguyenLieu.findById(ma);
	}

	@Override
	public List<NguyenLieu> findAll() {
		return nguyenLieu.findAllNL();
	}

}
