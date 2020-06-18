package annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwinJavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportConfig.class);
		SwimCoach coach=(SwimCoach) context.getBean("swimCoach",Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFoutune());
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());

		context.close();
		

	}
 
}
