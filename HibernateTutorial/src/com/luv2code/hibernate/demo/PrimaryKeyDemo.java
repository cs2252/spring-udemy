package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

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
					Student tempStudent1=new Student("paul","wall","paul@email.com");
					Student tempStudent2=new Student("paul","wall","paul@email.com");

					Student tempStudent3=new Student("paul","wall","paul@email.com");

					Student tempStudent4=new Student("paul","wall","paul@email.com");
					Student tempStudent5=new Student("paul","wall","paul@email.com");

					
					session.beginTransaction();
					
					session.save(tempStudent1);
					session.save(tempStudent2);
					session.save(tempStudent3);
					session.save(tempStudent4);
					session.save(tempStudent5);

					
					
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
