package com.APISpring.dao.imp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.APISpring.dao.IKhachHangDAO;
import com.APISpring.entities.KhachHang;
import com.APISpring.util.HibernateUtil;

@Repository
public class KhachHangDAO extends AbstractDAO<KhachHang> implements IKhachHangDAO {

	@Override
	public KhachHang findById(String id) {
		return get("com.APISpring.entities.KhachHang", id);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public KhachHang findBySdt(Long sdt) {
		KhachHang khachHang = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			String hql = "from KhachHang where sdt = ?0";
			Query query = session.createQuery(hql);
			query.setParameter(0, sdt);
			khachHang = (KhachHang) query.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return khachHang;
	}

	@Override
	public List<KhachHang> findAllKH() {
		return getAll("KhachHang");
	}

	@Override
	public KhachHang updateKH(KhachHang kh) {
		return update(kh);
	}

}
