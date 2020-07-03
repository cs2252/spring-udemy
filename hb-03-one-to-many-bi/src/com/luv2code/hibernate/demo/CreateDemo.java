package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory=new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(Course.class)
									.addAnnotatedClass(InstructorDetail.class)
									.buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		
		try {
			//create objects
			Instructor tempInstructor=new Instructor("Chad","darby","darby@gmail.com");
			InstructorDetail tempInstructorDetail=new InstructorDetail("myYoutubeChannel","lovetowcode");
			
			//assciates objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			session.beginTransaction();
			
			//save the objects
			session.save(tempInstructor);
			
			
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
