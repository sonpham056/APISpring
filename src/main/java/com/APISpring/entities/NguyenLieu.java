package com.APISpring.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="NguyenLieu")
public class NguyenLieu implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String maNguyenLieu;
	private String tenNguyenLieu;
	private Integer soLuong;
	
	@OneToMany(mappedBy = "nguyenLieu")
	private List<MonAn> monAns;

	public String getMaNguyenLieu() {
		return maNguyenLieu;
	}

	public void setMaNguyenLieu(String maNguyenLieu) {
		this.maNguyenLieu = maNguyenLieu;
	}

	public String getTenNguyenLieu() {
		return tenNguyenLieu;
	}

	public void setTenNguyenLieu(String tenNguyenLieu) {
		this.tenNguyenLieu = tenNguyenLieu;
	}

	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public List<MonAn> getMonAns() {
		return monAns;
	}
	
	public void setMonAns(List<MonAn> monAns) {
		this.monAns = monAns;
	}
	
	
	
}
