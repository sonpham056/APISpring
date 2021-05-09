package com.APISpring.dao.imp;

import org.springframework.stereotype.Repository;

import com.APISpring.dao.INhanVienDAO;
import com.APISpring.entities.NhanVien;

@Repository
public class NhanVienDAO extends AbstractDAO<NhanVien> implements INhanVienDAO{

	@Override
	public NhanVien findById(String maNV) {
		return get("com.APISpring.entities.NhanVien", maNV);
	}

}
