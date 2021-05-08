package com.APISpring.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="KhachHang")
public class KhachHang implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String maKH;
	private String tenKH;
	private String gioiTinh;
	private Integer namSinh;
	private Long sdt;
	private Long tien;
	private Integer status;
	
	@OneToOne(mappedBy = "khachHang")
	private TaiKhoanKH taiKhoanKH;
	
	@OneToMany(mappedBy = "khachHang")
	private List<HoaDon> hoaDons;
	
	@ManyToOne
	@JoinColumn(name = "maLoaiKH")
	private LoaiKhachHang loaiKhachHang;

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	
	public LoaiKhachHang getLoaiKhachHang() {
		return loaiKhachHang;
	}
	
	public void setLoaiKhachHang(LoaiKhachHang loaiKhachHang) {
		this.loaiKhachHang = loaiKhachHang;
	}
	
	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Integer getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(Integer namSinh) {
		this.namSinh = namSinh;
	}

	public Long getSdt() {
		return sdt;
	}

	public void setSdt(Long sdt) {
		this.sdt = sdt;
	}

	public Long getTien() {
		return tien;
	}

	public void setTien(Long tien) {
		this.tien = tien;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public TaiKhoanKH getTaiKhoanKH() {
		return taiKhoanKH;
	}

	public void setTaiKhoanKH(TaiKhoanKH taiKhoanKH) {
		this.taiKhoanKH = taiKhoanKH;
	}

	public List<HoaDon> getHoaDons() {
		return hoaDons;
	}

	public void setHoaDons(List<HoaDon> hoaDons) {
		this.hoaDons = hoaDons;
	}
	
	
	
}
