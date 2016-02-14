package com.hibernateWeb.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.hibernateWeb.Beans.StudentBean;

public class HibernateDao {

	public SessionFactory getSessionFactory(){
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}
	
	public void insertStudent(StudentBean studentBean)
	{
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.save(studentBean);
		session.getTransaction().commit();
		session.close();
	}
	
}
