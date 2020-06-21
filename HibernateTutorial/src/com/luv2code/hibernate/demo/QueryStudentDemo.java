package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory=new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		//create session
		Session session=factory.getCurrentSession();
		
		try {
			
			
			
			session.beginTransaction();
			
			List<Student> students=session.createQuery("from Student").list();
			displayStudents(students);
			
			students=session.createQuery("from Student where id>5").list();
			
			System.out.println("students with id greater than 5");
			displayStudents(students);
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
			
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}finally {
			session.close();
		}
		

	}

	public static void displayStudents(List<Student> students) {
		for(Student s:students)
			System.out.println(s);
	}

}
