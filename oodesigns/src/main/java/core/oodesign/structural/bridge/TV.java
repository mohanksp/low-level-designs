package core.oodesign.structural.bridge;

public class TV implements IEquipment {

	@Override
	public void start() {
		System.out.println("TV is on");
	}

	@Override
	public void stop() {
		System.out.println("TV is off");
	}

}
