package core.oodesign.behavioral.observer;

public class Main {
	public static void main(String[] args) {
		Akshay celebrity = new Akshay();
		celebrity.follow(new Fan1());
		celebrity.follow(new Fan2());
		Fan3 fan3 = new Fan3();
		celebrity.follow(fan3);

		celebrity.setLetestMovie("Robot 2.0");
		
		celebrity.unfollow(fan3);
		
		celebrity.setLetestMovie("Bhahubali");
	}

}
