package com.APISpring.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="LoaiMonAn")
public class LoaiMonAn implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private String maLoai;
	private String tenLoai;
	private Long giaTien;
	private Integer status;
	
	@OneToMany(mappedBy = "loaiMonAn")
	@JsonIgnore
	private List<MonAn> monAns;

	public String getMaLoai() {
		return maLoai;
	}

	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public Long getGiaTien() {
		return giaTien;
	}

	public void setGiaTien(Long giaTien) {
		this.giaTien = giaTien;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<MonAn> getMonAns() {
		return monAns;
	}

	public void setMonAns(List<MonAn> monAns) {
		this.monAns = monAns;
	}

	
	
}
