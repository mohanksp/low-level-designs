package core.oodesign.structural.bridge;

public class Bulb implements IEquipment {

	@Override
	public void start() {
		System.out.println("Bulb is on");
	}

	@Override
	public void stop() {
		System.out.println("Bulb is off");
	}

}
