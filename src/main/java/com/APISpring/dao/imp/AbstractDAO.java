package com.APISpring.dao.imp;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.APISpring.dao.IGeneric;
import com.APISpring.entities.LoaiMonAn;
import com.APISpring.util.HibernateUtil;



public class AbstractDAO<T> implements IGeneric<T> {

	@SuppressWarnings("hiding")
	@Override
	public <T> T save(T saver) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(saver);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
		return saver;
	}

	@SuppressWarnings("hiding")
	@Override
	public <T> T update(T updater) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.update(updater);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			session.close();
		}
		return updater;
	}

	@SuppressWarnings("hiding")
	@Override
	public <T> int delete(T deleter) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.delete(deleter);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally {
			session.close();
		}
		return 1;
	}

	@SuppressWarnings({ "unchecked", "hiding" })
	@Override
	public <T> T get(String className, String id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		T obj =  null;
		try {
			obj = (T) session.get(className, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return obj;
	}

	@SuppressWarnings({ "unchecked", "hiding" })
	@Override
	public <T> List<T> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<T> list = null;
		try {
			String hql = "from LoaiMonAn";
			list = session.createQuery(hql).list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

}
