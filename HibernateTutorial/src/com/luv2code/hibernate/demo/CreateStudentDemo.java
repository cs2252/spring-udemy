package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory=new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		
		try {
			
			System.out.println("creating new Student object");
			Student tempStudent=new Student("paul","wall","paul@email.com");
			
			session.beginTransaction();
			
			session.save(tempStudent);
			
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally {
			session.close();
		}
		

	}

}
