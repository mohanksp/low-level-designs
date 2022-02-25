package core.oodesign.structural.proxy;

public class Car implements Vehicle {

	@Override
	public String getname() {
		return "Ford Figo";
	}

	@Override
	public void start() {
		System.out.println("Start");
	}

	@Override
	public void stop() {
		System.out.println("Stop");
	}

	@Override
	public void forword() {
		System.out.println("Move Forword");
	}

	@Override
	public void reverse() {
		System.out.println("Move Reverse");
	}

	@Override
	public void speed() {
		System.out.println("150 Km/hour");
	}
}
