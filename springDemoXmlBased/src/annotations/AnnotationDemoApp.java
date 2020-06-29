package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FortuneService fs=context.getBean("happyFortuneService",FortuneService.class);
//		FortuneService fs=context.getBean(FortuneService.class);
		
		System.out.println(fs.getFortune());
		
		context.close();
		
		

	}
 
}
