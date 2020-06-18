package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CricketCoach coach=context.getBean("myCricketCoach",ioc.CricketCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFoutune());
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		
		context.close();

	}

}
