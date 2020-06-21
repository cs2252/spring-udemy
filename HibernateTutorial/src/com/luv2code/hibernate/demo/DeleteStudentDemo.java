package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory=new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		
		try {
			int studentId=2;
			
			
			session.beginTransaction();
			
//			Student s=session.get(Student.class,studentId);
//			
//			System.out.println("deleting student");
//			session.delete(s);
			
			session.createQuery("delete from Student where id=1").executeUpdate();
			session.getTransaction().commit();
			
			System.out.println("Done!");
//			System.out.println(s);
			
			
			
			
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally {
			session.close();
		}
		

	}

}
