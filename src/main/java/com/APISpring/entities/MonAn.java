package com.APISpring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="MonAn")
public class MonAn implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String maMA;
	private String tenMA;
	private Integer status;
	
	@ManyToOne
	@JoinColumn(name="maLoai")
	private LoaiMonAn loaiMonAn;
	
	@ManyToOne
	@JoinColumn(name="maNguyenLieu")
	private NguyenLieu nguyenLieu;

	public String getMaMA() {
		return maMA;
	}

	public void setMaMA(String maMA) {
		this.maMA = maMA;
	}

	public String getTenMA() {
		return tenMA;
	}

	public void setTenMA(String tenMA) {
		this.tenMA = tenMA;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public LoaiMonAn getLoaiMonAn() {
		return loaiMonAn;
	}

	public void setLoaiMonAn(LoaiMonAn loaiMonAn) {
		this.loaiMonAn = loaiMonAn;
	}

	public NguyenLieu getNguyenLieu() {
		return nguyenLieu;
	}

	public void setNguyenLieu(NguyenLieu nguyenLieu) {
		this.nguyenLieu = nguyenLieu;
	}
	
	
}
