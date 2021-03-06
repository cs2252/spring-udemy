package ioc;

public class BaseBallCoach implements Coach{
	
	private FortuneService fortuneService;
	
	
	
	public BaseBallCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "spend 30 mins batting practice";
	} 

	@Override
	public String getDailyFoutune() {

		return fortuneService.getFortune();
	}
}
