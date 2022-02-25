package core.oodesign.behavioral.observer;

public class Fan1 implements IFan {

	@Override
	public void update(String movie) {
		System.out.println("fan1 :: new movie "+ movie +" coming soon...");
	}

}
