package com.easetrack.DB;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.hibernate.Query;

public class Session {

	private org.hibernate.Session session = null;

	public Session(org.hibernate.Session newSession) {
		session = newSession;
		session.beginTransaction();
	}

	public void close() {
		if (session.isOpen()) {
			session.close();
		}
	}

	public Object getObjectByKey(Class<?> className, Serializable key) {
		Object obj = session.get(className, key);
		this.close();
		return obj;
	}

	public Serializable save(Object arg0) {
		Serializable ret = session.save(arg0);
		session.getTransaction().commit();
		return ret;
	}

	public void update(Object arg0) {
		session.update(arg0);
		session.getTransaction().commit();
	}

	public List<?> execute(String hql, Map<String, Object> params) {
		Query query = session.createQuery(hql);
		for (Entry<String, Object> entry : params.entrySet()) {
			if (entry.getValue() instanceof String) {
				query.setString(entry.getKey(), entry.getValue().toString());
			} else if (entry.getValue() instanceof Integer) {
				query.setInteger(entry.getKey(),
						Integer.parseInt(entry.getValue().toString()));
			} else if (entry.getValue() instanceof Long) {
				query.setLong(entry.getKey(),
						Long.parseLong(entry.getValue().toString()));
			}

		}
		List<?> list = query.list();
		return list;
	}

	public List<?> execute(String hql) {
		Query query = session.createQuery(hql);
		List<?> results = query.list();

		return results;
	}
	
	public int executeHql(String hql,Map<String, Object> params){
		Query query = session.createQuery(hql);
		
		for (Entry<String, Object> entry : params.entrySet()) {
			if (entry.getValue() instanceof String) {
				query.setString(entry.getKey(), entry.getValue().toString());
			} else if (entry.getValue() instanceof Integer) {
				query.setInteger(entry.getKey(),
						Integer.parseInt(entry.getValue().toString()));
			} else if (entry.getValue() instanceof Long) {
				query.setLong(entry.getKey(),
						Long.parseLong(entry.getValue().toString()));
			}

		}
		int result =query.executeUpdate();
		return result;
		
		
	}

	public List<?> executeSql(String sql) {
		Query query = session.createSQLQuery(sql);
		List<?> results = query.list();

		return results;
	}

	public Serializable saveTransaction(Object arg0) {
		Serializable ret = session.save(arg0);
		return ret;
	}

	public void updateTransaction(Object arg0) {
		session.update(arg0);
	}

	public void commitTransaction() {
		session.getTransaction().commit();
	}

}
