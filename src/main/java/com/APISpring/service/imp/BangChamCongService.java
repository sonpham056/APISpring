package com.APISpring.service.imp;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.APISpring.dao.IBangChamCongDAO;
import com.APISpring.entities.BangChamCong;
import com.APISpring.service.IBangChamCongService;

@Service
public class BangChamCongService implements IBangChamCongService{

	@Autowired
	IBangChamCongDAO bangChamCong;
	
	@Override
	public List<BangChamCong> findAll() {
		return bangChamCong.findAll();
	}

	@Override
	public BangChamCong findByNVId(String id) {
		return bangChamCong.findByNVId(id);
	}

	@Override
	public BangChamCong save(BangChamCong bcc) {
		return bangChamCong.saveBCC(bcc);
	}

	@Override
	public BangChamCong update(BangChamCong bcc) {
		return bangChamCong.updateBCC(bcc);
	}

	@Override
	public List<BangChamCong> findByDateAndId(Date tuNgay, Date denNgay, String id) {
		return bangChamCong.findByDateAndId(tuNgay, denNgay, id);
	}

	@Override
	public List<BangChamCong> findByDate(Date tuNgay, Date denNgay) {
		return bangChamCong.findByDate(tuNgay, denNgay);
	}
	
}
