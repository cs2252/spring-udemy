package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Coach coach=context.getBean("tenisCoach",Coach.class);
		Coach coach1=context.getBean("tenisCoach",Coach.class);
		
		if(coach==coach1)
		{
			System.out.println("Both objects are smae");
		}
		else
			System.out.println("they are different");
		
		context.close();

	}

}
