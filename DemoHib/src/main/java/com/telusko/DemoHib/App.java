package com.telusko.DemoHib;
import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import mapping.Laptop;
import mapping.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Laptop l=new Laptop();
    	l.setLid(1);
    	l.setLname("dell");
    	
    	Student s=new Student();
    	s.setSid(101);
    	s.setSname("chandan");
    	s.setMarks(99);
    	s.getLaptop().add(l);
    	
    
        
      try {
    	  Configuration con=new Configuration().configure()
          		.addAnnotatedClass(Laptop.class);
          SessionFactory sf=con.buildSessionFactory();
          Session session=sf.openSession();
          
          Transaction tx=session.beginTransaction();
          session.save(l);
          l.setLname("hp");
//          telusko=session.get(Alien.class, 102);
        	tx.commit();
//          System.out.println(telusko)
      }catch(Exception ex)
      {
    	  System.out.println("exception catched");
    	  System.out.println(ex.getMessage());
      }
        
    }
}
