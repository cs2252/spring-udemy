package ioc;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run a hard 5k";
	}

	@Override
	public String getDailyFoutune() {
		// TODO Auto-generated method stub
		return " foutune for TrackCoach classs";
	}
	
	//init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside init mathod");
	}
	//destroy method
	public void destroy() {
		System.out.println("Trackcoach: inside destroy method" );
	}

}
