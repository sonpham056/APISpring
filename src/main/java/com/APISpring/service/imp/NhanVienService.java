package com.APISpring.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APISpring.dao.INhanVienDAO;
import com.APISpring.entities.NhanVien;
import com.APISpring.service.INhanVienService;

@Service
public class NhanVienService implements INhanVienService{

	@Autowired
	private INhanVienDAO nhanVienDAO;
	
	@Override
	public NhanVien findById(String maNV) {
		return nhanVienDAO.findById(maNV);
	}

	@Override
	public List<NhanVien> findAll() {
		return nhanVienDAO.findAll();
	}

	@Override
	public NhanVien save(NhanVien nhanVien) {
		return nhanVienDAO.saveNhanVien(nhanVien);
	}

	@Override
	public NhanVien update(NhanVien nhanVien) {
		return nhanVienDAO.updateNhanVien(nhanVien);
	}

	@Override
	public int delete(NhanVien nhanVien) {
		return nhanVienDAO.deleteNhanVien(nhanVien);
	}

}
