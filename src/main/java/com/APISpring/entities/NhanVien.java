package com.APISpring.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="NhanVien")
public class NhanVien implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String maNV;
	private String tenNV;
	private String gioiTinh;
	private Integer namSinh;
	private Long sdt;
	private Integer status;
	
	@OneToMany(mappedBy = "nhanVien")
	@JsonIgnore
	private List<HoaDon> hoaDons;
	
	@OneToOne(mappedBy = "nhanVien")
	private TaiKhoanNV taiKhoanNV;
	
	@OneToMany(mappedBy = "nhanVien")
	@JsonIgnore
	private List<BangChamCong> bangChamCongs;

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<HoaDon> getHoaDons() {
		return hoaDons;
	}

	public void setHoaDons(List<HoaDon> hoaDons) {
		this.hoaDons = hoaDons;
	}

	public TaiKhoanNV getTaiKhoanNV() {
		return taiKhoanNV;
	}

	public void setTaiKhoanNV(TaiKhoanNV taiKhoanNV) {
		this.taiKhoanNV = taiKhoanNV;
	}

	public List<BangChamCong> getBangChamCongs() {
		return bangChamCongs;
	}

	public void setBangChamCongs(List<BangChamCong> bangChamCongs) {
		this.bangChamCongs = bangChamCongs;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
