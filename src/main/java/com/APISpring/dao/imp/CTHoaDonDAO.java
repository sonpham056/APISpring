package com.APISpring.dao.imp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.APISpring.dao.ICTHoaDonDAO;
import com.APISpring.entities.CTHoaDon;
import com.APISpring.entities.HoaDon;
import com.APISpring.util.HibernateUtil;

@Repository
public class CTHoaDonDAO extends AbstractDAO<CTHoaDon> implements ICTHoaDonDAO {

	@Override
	public CTHoaDon saveHD(CTHoaDon cthd) {
		return save(cthd);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<CTHoaDon> findAllHD(HoaDon hd) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<CTHoaDon> list = null;
		try {
			String hql = "from CTHoaDon c where c.hoaDon = ?0";
			Query query = session.createQuery(hql);
			query.setParameter(0, hd);
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
}
