package com.APISpring.dao;

import java.util.Date;
import java.util.List;

import com.APISpring.entities.BangChamCong;

public interface IBangChamCongDAO extends IGeneric<BangChamCong>{
	List<BangChamCong> findAll();
	BangChamCong saveBCC(BangChamCong bcc);
	BangChamCong findByNVId(String id);
	BangChamCong updateBCC(BangChamCong bcc);
	List<BangChamCong> findByDateAndId(Date tuNgay, Date denNgay, String id);
	List<BangChamCong> findByDate(Date tuNgay, Date denNgay);
}
