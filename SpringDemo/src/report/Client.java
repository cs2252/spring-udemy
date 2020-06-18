package report;
//import org.springframework.context.ApplicatinContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Client {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		ReportService service=(ReportService) context.getBean("reportService");
		service.generateReport();
		
	}

}
