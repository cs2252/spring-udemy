package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
//	@Value("100")
//	int temp;
//	@Value("some string")
//	String s;
//	@Autowired
	FortuneMessage fortuneMessage;
//	@Autowired
	public HappyFortuneService() {
		System.out.println("HappyFortuneService: default constructor");
	}
	@Autowired
	public HappyFortuneService(FortuneMessage fortuneMessage) {
		System.out.println("HappyFortuneService: parametrised constructor");
		this.fortuneMessage = fortuneMessage;
		
	}
	

	public FortuneMessage getFortuneMessage() {
		System.out.println("HappyfortuneService: getter method");
		return fortuneMessage;
	}
//	@Autowired
	public void setFortuneMessage(FortuneMessage fortuneMessage) {
		System.out.println("HappyfortuneServices: setter method");

		this.fortuneMessage = fortuneMessage;
	}

	@Override
	public String getFortune() {
		
		return "HappyFortuneService : "+fortuneMessage.getMessage();
	}

}
