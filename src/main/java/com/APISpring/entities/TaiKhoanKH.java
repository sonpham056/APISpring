package com.APISpring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name="TaiKhoanKH")
public class TaiKhoanKH implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String MK;
	
	@Id
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "maKH")
	@JsonManagedReference
	private KhachHang khachHang;

	public String getMatKhau() {
		return MK;
	}

	public void setMatKhau(String matKhau) {
		this.MK = matKhau;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	
	
}
