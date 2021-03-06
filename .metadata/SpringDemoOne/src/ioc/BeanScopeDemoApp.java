package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean-scope-ApplicationContext1.xml");
		Coach coach=context.getBean("myCoach",Coach.class);
		Coach coach1=context.getBean("myCoach",Coach.class);
		
		if(coach==coach1)
		{
			System.out.println("both are same object");
		}
		else {
			System.out.println("both objects are different");
		}
		context.close();

	}

}
