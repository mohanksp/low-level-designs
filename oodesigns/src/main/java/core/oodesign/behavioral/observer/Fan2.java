package core.oodesign.behavioral.observer;

public class Fan2 implements IFan {

	@Override
	public void update(String movie) {
		System.out.println("fan2 :: new movie "+ movie +" coming soon...");
	}
}
