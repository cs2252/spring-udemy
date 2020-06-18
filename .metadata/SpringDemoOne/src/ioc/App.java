package ioc;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//create object
		Coach coach = new TrackCoach();
		
		
		//use object
		System.out.println(coach.getDailyWorkout());
	}

}
