package com.APISpring.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="BangChamCong")
public class BangChamCong {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer stt;
	private Date batDau;
	private Date ketThuc;
	
	@ManyToOne
	@JoinColumn(name="maNV")
	private NhanVien nhanVien;

	public int getStt() {
		return stt;
	}

	public void setStt(Integer stt) {
		this.stt = stt;
	}

	public Date getBatDau() {
		return batDau;
	}

	public void setBatDau(Date batDau) {
		this.batDau = batDau;
	}

	public Date getKetThuc() {
		return ketThuc;
	}

	public void setKetThuc(Date ketThuc) {
		this.ketThuc = ketThuc;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	
	
}
