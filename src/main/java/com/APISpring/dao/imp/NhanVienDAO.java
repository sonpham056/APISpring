package com.APISpring.dao.imp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.APISpring.dao.INhanVienDAO;
import com.APISpring.entities.NhanVien;

@Repository
public class NhanVienDAO extends AbstractDAO<NhanVien> implements INhanVienDAO{

	@Override
	public NhanVien findById(String maNV) {
		return get("com.APISpring.entities.NhanVien", maNV);
	}

	@Override
	public List<NhanVien> findAll() {
		return getAll("NhanVien");
	}

	@Override
	public NhanVien saveNhanVien(NhanVien nhanVien) {
		return save(nhanVien);
	}

	@Override
	public NhanVien updateNhanVien(NhanVien nhanVien) {
		return update(nhanVien);
	}

	@Override
	public int deleteNhanVien(NhanVien nhanVien) {
		return delete(nhanVien);
	}

}
