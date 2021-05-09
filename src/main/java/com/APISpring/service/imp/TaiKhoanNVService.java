package com.APISpring.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APISpring.dao.ITaiKhoanNVDAO;
import com.APISpring.entities.TaiKhoanNV;
import com.APISpring.service.ITaiKhoanNVService;

@Service
public class TaiKhoanNVService implements ITaiKhoanNVService{

	@Autowired
	ITaiKhoanNVDAO taiKhoanNV;
	
	@Override
	public TaiKhoanNV findById(String id) {
		return taiKhoanNV.findById(id);
	}

	@Override
	public TaiKhoanNV save(TaiKhoanNV tk) {
		return taiKhoanNV.saveTaiKhoanNV(tk);
	}

	@Override
	public int delete(TaiKhoanNV tk) {
		return taiKhoanNV.deleteTaiKhoanNV(tk);
	}

	@Override
	public TaiKhoanNV update(TaiKhoanNV tk) {
		return taiKhoanNV.updateTaiKhoanNV(tk);
	}
	
}
