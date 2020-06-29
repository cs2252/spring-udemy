package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
		
		
		
		HappyFortuneService fs=(HappyFortuneService) context.getBean("bean",FortuneService.class);	
		System.out.println(fs.getFortune());
		System.out.println(fs.getTemp());
		
		
		
		

	}
 
}
