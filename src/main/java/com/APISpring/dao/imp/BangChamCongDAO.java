package com.APISpring.dao.imp;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.APISpring.dao.IBangChamCongDAO;
import com.APISpring.entities.BangChamCong;
import com.APISpring.util.HibernateUtil;

@Repository
public class BangChamCongDAO extends AbstractDAO<BangChamCong> implements IBangChamCongDAO{

	@Override
	public List<BangChamCong> findAll() {
		return getAll("BangChamCong");
	}

	@Override
	public BangChamCong saveBCC(BangChamCong bcc) {
		return save(bcc);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public BangChamCong findByNVId(String id) {
		BangChamCong bangChamCong = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			String hql = "from BangChamCong h where h.nhanVien.maNV = ?0 ORDER BY h.batDau desc";
			Query query = session.createQuery(hql);
			query.setParameter(0, id);
			bangChamCong = (BangChamCong) query.setMaxResults(1).uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return bangChamCong;
	}

	@Override
	public BangChamCong updateBCC(BangChamCong bcc) {
		return update(bcc);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<BangChamCong> findByDateAndId(Date tuNgay, Date denNgay, String id) {
		List<BangChamCong> list = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			String hql = "from BangChamCong h where h.batDau >= ?0 "
					+ " AND h.batDau <= ?1"
					+ " AND h.nhanVien.maNV = ?2";
			Query query = session.createQuery(hql);
			query.setParameter(0, tuNgay);
			query.setParameter(1, denNgay);
			query.setParameter(2, id);
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<BangChamCong> findByDate(Date tuNgay, Date denNgay) {
		List<BangChamCong> list = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			String hql = "from BangChamCong h where h.batDau >= ?0 "
					+ " AND h.batDau <= ?1";
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
	
	

}
