package annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TenisCoach implements Coach {
	@Autowired
	private FortuneService fortuneService;
//	@Autowired(required=false)
	public TenisCoach()
	{
		System.out.println("inside the default constructor of FortuneService");
	}
//	@Autowired(required=false)
	public TenisCoach(FortuneService fortuneService) {
		System.out.println("TenisCoach constructor called");
		
		this.fortuneService = fortuneService;
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
//	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setter method:setFortuneService");
		this.fortuneService = fortuneService;
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("inside method:postConstruct");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("inside method:preDestroy");
	}
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "some random workout";
	}
	@Override
	public String getDailyFoutune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
