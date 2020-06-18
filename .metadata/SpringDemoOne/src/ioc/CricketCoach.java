package ioc;

public class CricketCoach implements Coach {
	

	private FortuneService fortuneService;
	private String email;
	private String team;
	

	public CricketCoach() {
	System.out.println("inside default constructor of CricketCoach");
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "practice fast bowling 15 mins each day"; 
	}

	@Override
	public String getDailyFoutune() {
		
		return fortuneService.getFortune();	
	}

}
