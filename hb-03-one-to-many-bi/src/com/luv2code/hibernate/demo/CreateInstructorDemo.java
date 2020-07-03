package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateInstructorDemo {

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
			
			Instructor tempInstructor=new Instructor("Susan","Public","publicSuana@gmail.com");
			InstructorDetail tempInstructorDetail=new InstructorDetail("myYoutabu channel","loves to paly video games");
			
			tempInstructor.setInstructorDetail(tempInstructorDetail);
//			tempInstructorDetail.setInstructor(tempInstructor);
			
			
			session.beginTransaction();
			
			//save the objects
			session.save(tempInstructor);
			
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}catch(Exception ex)
		{
			System.out.println("something bad happned");
//			ex.printStackTrace();
		}finally {
			session.close();
		}
		

	}

}
