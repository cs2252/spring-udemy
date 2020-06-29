package annotations;

import org.springframework.stereotype.Component;

@Component
public class FortuneMessage {
	private String message;

	public FortuneMessage() {
		System.out.println("FortuneMessage: default Constructor");
		message="EveryDay is an Opportunity";
	}
//	public FortuneMessage(String message) {
//		this.message = message;
//	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
