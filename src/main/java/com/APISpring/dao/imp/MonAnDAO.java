package com.APISpring.dao.imp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.APISpring.dao.IMonAnDAO;
import com.APISpring.entities.MonAn;
import com.APISpring.util.HibernateUtil;

@Repository
public class MonAnDAO extends AbstractDAO<MonAn> implements IMonAnDAO{

	@Override
	public List<MonAn> findAll() {
		return getAll("MonAn");
	}

	@Override
	public MonAn findById(String id) {
		return get("com.APISpring.entities.MonAn", id);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public MonAn findByName(String name) {
		MonAn monAn = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			String hql = "from MonAn m where m.tenMA = ?0";
			Query query = session.createQuery(hql);
			query.setParameter(0, name);
			monAn = (MonAn) query.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return monAn;
	}

	@Override
	public MonAn saveMonAn(MonAn monAn) {
		return save(monAn);
	}

	@Override
	public MonAn updateMonAn(MonAn monAn) {
		return update(monAn);
	}

	@Override
	public int deleteMonAn(MonAn monAn) {
		return delete(monAn);
	}

}
