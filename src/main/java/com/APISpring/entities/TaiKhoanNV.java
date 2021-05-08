package com.APISpring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="TaiKhoanNV")
public class TaiKhoanNV implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String MK;
	
	@Id
	@OneToOne
	@JoinColumn(name="maNV")
	private NhanVien nhanVien;

	public String getMatKhau() {
		return MK;
	}

	public void setMatKhau(String matKhau) {
		this.MK = matKhau;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	
	
}
