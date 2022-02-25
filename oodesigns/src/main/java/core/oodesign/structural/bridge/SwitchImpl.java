package core.oodesign.structural.bridge;

public class SwitchImpl implements ISwitch {

	private IEquipment equipment;
	
	public void setEquipment(IEquipment equipment){
		this.equipment = equipment;
	}
	@Override
	public void on() {
		equipment.start();
	}

	@Override
	public void off() {
		equipment.stop();
	}

}
