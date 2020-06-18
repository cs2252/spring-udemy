package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean-lifecycle-ApplicationContext2.xml");
		Coach coach=context.getBean("myCoach",Coach.class);
		
		System.out.println(coach.getDailyFoutune());
		System.out.println(coach.getDailyWorkout());
		
		context.close();

	}

}
