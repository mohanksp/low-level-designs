package core.oodesign.structural.bridge;

public class Refrigerator implements IEquipment {

	@Override
	public void start() {
		System.out.println("Refrigerator is on");
	}

	@Override
	public void stop() {
		System.out.println("Refrigerator is off");
	}

}
