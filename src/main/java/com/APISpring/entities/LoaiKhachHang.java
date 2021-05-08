package com.APISpring.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="LoaiKhachHang")
public class LoaiKhachHang implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String maLoaiKH;
	private String tenLoaiKH;
	
	@OneToMany(mappedBy = "loaiKhachHang")
	private List<KhachHang> khachHangs;

	public String getMaLoaiKH() {
		return maLoaiKH;
	}

	public void setMaLoaiKH(String maLoaiKH) {
		this.maLoaiKH = maLoaiKH;
	}

	public String getTenLoaiKH() {
		return tenLoaiKH;
	}

	public void setTenLoaiKH(String tenLoaiKH) {
		this.tenLoaiKH = tenLoaiKH;
	}

	public List<KhachHang> getKhachHangs() {
		return khachHangs;
	}

	public void setKhachHangs(List<KhachHang> khachHangs) {
		this.khachHangs = khachHangs;
	}
}
