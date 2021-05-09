package com.APISpring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="HoaDon")
public class HoaDon implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String maHD;
	private Date ngayLap;
	private Long tongTien;
	
	@ManyToOne()
	@JoinColumn(name = "maNV")
	private NhanVien nhanVien;
	
	@ManyToOne()
	@JoinColumn(name="maKH")
	private KhachHang khachHang;

	public String getMaHD() {
		return maHD;
	}

	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}

	public Date getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public Long getTongTien() {
		return tongTien;
	}

	public void setTongTien(Long tongTien) {
		this.tongTien = tongTien;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
