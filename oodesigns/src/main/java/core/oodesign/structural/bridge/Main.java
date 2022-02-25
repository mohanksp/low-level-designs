package core.oodesign.structural.bridge;

public class Main {

	public static void main(String[] args) {

		
		SwitchImpl switchObj = new SwitchImpl();
		switchObj.setEquipment(new Bulb());
		switchObj.on();
		switchObj.off();
		
		switchObj.setEquipment(new TV());
		switchObj.on();
		switchObj.off();

		switchObj.setEquipment(new Refrigerator());
		switchObj.on();
		switchObj.off();

	}

}
