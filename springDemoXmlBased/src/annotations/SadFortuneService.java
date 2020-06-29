package annotations;

public class SadFortuneService implements FortuneService {

	private FortuneMessage fortuneMessage;
	
	public  SadFortuneService() {
		System.out.println("SadFortuneService : default constructor" );
	}
	
	public SadFortuneService(FortuneMessage fortuneMessage) {
		System.out.println("SadFortuneService : parametrised constructor" );
		this.fortuneMessage = fortuneMessage;
	}
	
	public FortuneMessage getFortuneMessage() {
		System.out.println("SadFortuneService :  getter method" );

		return fortuneMessage;
	}

	public void setFortuneMessage(FortuneMessage fortuneMessage) {
		System.out.println("SadFortuneService :  setter method" );

		this.fortuneMessage = fortuneMessage;
	}



	@Override
	public String getFortune() {
		
		return "SadFoutuneService : Today is a sad day";
	}

}
