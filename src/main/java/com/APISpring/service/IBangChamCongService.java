package com.APISpring.service;

import java.util.Date;
import java.util.List;

import com.APISpring.entities.BangChamCong;

public interface IBangChamCongService {
	List<BangChamCong> findAll();
	BangChamCong save(BangChamCong bcc);
	BangChamCong findByNVId(String id);
	BangChamCong update(BangChamCong bcc);
	List<BangChamCong> findByDateAndId(Date tuNgay, Date denNgay, String id);
	List<BangChamCong> findByDate(Date tuNgay, Date denNgay);
}
