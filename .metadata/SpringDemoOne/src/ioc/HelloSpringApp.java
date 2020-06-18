package ioc;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloSpringApp {

	public static void main(String[] args) {

		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//retrive spring bean
		Coach coach=context.getBean("myCoach",Coach.class);
		//use bean 
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFoutune());
		
		//close context
		context.close();
	}

}
