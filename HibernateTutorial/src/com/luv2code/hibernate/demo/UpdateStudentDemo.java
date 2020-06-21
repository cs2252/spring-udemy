package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory=new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		
		try {
			int studentId=1;
			
			
			session.beginTransaction();
			
			Student s=session.get(Student.class,studentId);
			
			System.out.println("updating student");
			s.setFirstName("chandan");
			s.setLastName("kumar");
			session.getTransaction().commit();
			
			System.out.println("Done!");
			System.out.println(s);
			
			
			
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			session.createQuery("update Student set email='mrcs2252@gmail.com'").executeUpdate();
			
			
			
			session.getTransaction().commit();
			
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally {
			session.close();
		}
		

	}

}
