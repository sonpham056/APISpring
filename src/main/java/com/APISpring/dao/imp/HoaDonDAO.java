package com.APISpring.dao.imp;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.APISpring.dao.IHoaDonDAO;
import com.APISpring.entities.HoaDon;
import com.APISpring.util.HibernateUtil;

@Repository
public class HoaDonDAO extends AbstractDAO<HoaDon> implements IHoaDonDAO{

	@SuppressWarnings("rawtypes")
	@Override
	public HoaDon autoCreate() {
		HoaDon hoaDon = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			String hql = "from HoaDon order by ngayLap desc";
			Query query = session.createQuery(hql);
			query.setMaxResults(1);
			hoaDon = (HoaDon) query.uniqueResult();
			if (hoaDon == null) {
				hoaDon = new HoaDon();
				hoaDon.setMaHD("hd1");
			} else {
				String str = hoaDon.getMaHD().substring(2);
				Integer num = Integer.parseInt(str);
				num++;
				hoaDon = new HoaDon();
				hoaDon.setMaHD("hd" + num.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return hoaDon;
	}

	@Override
	public HoaDon findById(String id) {
		return get("com.APISpring.entities.HoaDon", id);
	}

	@Override
	public List<HoaDon> findAll() {
		return getAll("HoaDon");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<HoaDon> findByDate(Date tuNgay, Date denNgay) {
		List<HoaDon> list = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			String hql = "from HoaDon h where h.ngayLap >= ?0 "
					+ " AND h.ngayLap <= ?1";
			Query query = session.createQuery(hql);
			query.setParameter(0, tuNgay);
			query.setParameter(1, denNgay);
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public HoaDon saveHoaDon(HoaDon hoaDon) {
		return save(hoaDon);
	}
	
}
