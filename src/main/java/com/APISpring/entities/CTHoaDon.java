package com.APISpring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="CTHoaDon")
public class CTHoaDon implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer soLuong;
	
	@Id
	@ManyToOne()
	@JoinColumn(name="maHD")
	private HoaDon hoaDon;
	
	@Id
	@ManyToOne()
	@JoinColumn(name="maMA")
	private MonAn monAn;

	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public MonAn getMonAn() {
		return monAn;
	}

	public void setMonAn(MonAn monAn) {
		this.monAn = monAn;
	}
	
	@Override
	public String toString() {
		return hoaDon.getMaHD() + " / " + monAn.getTenMA() + " / " + soLuong;
	}
}
