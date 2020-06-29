package annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {
	
	@Bean
	public FortuneMessage fortuneMessage() {
		return new FortuneMessage();
	}
	
	@Bean
	public HappyFortuneService happyFortuneService(FortuneMessage fortuneMessage) {
		return new HappyFortuneService(fortuneMessage);
	}
	
	@Bean
	public SadFortuneService sadFortuneService() {
		return new SadFortuneService();
	}

}
