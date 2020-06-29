package annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class HappyFortuneService implements FortuneService {
	int temp;
	@Value("some string")
	String s;
	FortuneMessage fortuneMessage;
	
	public HappyFortuneService() {
		System.out.println("HappyFortuneService: default constructor");
	}
	
	public HappyFortuneService(FortuneMessage fortuneMessage,int temp,String s) {
		System.out.println("HappyFortuneService: parametrised constructor");
		this.fortuneMessage = fortuneMessage;
		this.temp=temp;
		this.s=s;
	}
	

	public FortuneMessage getFortuneMessage() {
		System.out.println("HappyfortuneService: getter method");
		return fortuneMessage;
	}

	public void setFortuneMessage(FortuneMessage fortuneMessage) {
		System.out.println("HappyfortuneServices: setter method");

		this.fortuneMessage = fortuneMessage;
	}

	@Override
	public String getFortune() {
		
		return "HappyFortuneService : "+fortuneMessage.getMessage()+" vale of temp="+temp+" value of s : "+s;
	}

}
