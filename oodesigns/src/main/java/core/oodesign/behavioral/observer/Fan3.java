package core.oodesign.behavioral.observer;

public class Fan3 implements IFan {

	@Override
	public void update(String movie) {
		System.out.println("fan3 :: new movie "+ movie +" coming soon...");
	}

}
