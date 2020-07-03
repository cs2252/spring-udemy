package com.luv2code.hibernate.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class DeleteDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory=new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		
		try {
//		
			int theId=1;
			
			session.beginTransaction();
			
			Instructor theInstructor =session.get(Instructor.class, theId);
			System.out.println("found the Instructor : "+theInstructor);
			
			if(theInstructor!=null)
			{
				session.delete(theInstructor);

			}
			
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
