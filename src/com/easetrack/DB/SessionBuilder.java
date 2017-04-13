package com.easetrack.DB;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionBuilder {
	private static Configuration configuration = new Configuration().configure();
	private static StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	private static SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());

	public static Session getNewSession()
	{
		Session session = new Session(sessionFactory.openSession());
		return session;
	}
}
