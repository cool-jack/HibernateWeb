package com.hibernateWeb.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.SetSimpleValueTypeSecondPass;
import org.hibernate.criterion.Restrictions;

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
	public List<StudentBean>  getAllStudent()
	{
		Session session = getSessionFactory().openSession();
		List<StudentBean> studentList = session.createQuery("from StudentBean").list();
		session.close();
		return studentList;
	}
	
	public StudentBean getStudentById(int id){
		StudentBean studentBean = null;
		Session session = getSessionFactory().openSession();
		Criteria studentCriteria = session.createCriteria(StudentBean.class,"student");
		studentCriteria.add(Restrictions.eq("student.id", id));
		Object result = studentCriteria.uniqueResult();
		if(result != null){
			studentBean = (StudentBean) result;
		}
		return studentBean;
	}
	public void deleteById(int id)
	{
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(StudentBean.class, "student");
		criteria.add(Restrictions.eq("student.id", id));
		StudentBean bean = (StudentBean) criteria.uniqueResult();
		if(bean != null){
			session.delete(bean);
		}
		session.getTransaction().commit();
		session.close();
	}
	public void deleteAll(){
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("delete from StudentBean");
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}
	
}
