package core.oodesign.structural.proxy;

public class VehicleProxy implements Vehicle {
	Vehicle v;
	public VehicleProxy(Vehicle v) {
		this.v = v;
	}

	@Override
	public String getname() {
		String name;
		System.out.println("proxy : something add before GetName");
		name = v.getname();
		System.out.println("proxy : something add afetr GetName");
		return name;
	}

	@Override
	public void start() {
		System.out.println("proxy : something add before start");
		v.start();
		System.out.println("proxy : something add afetr start ");
	}

	@Override
	public void stop() {
		System.out.println("proxy : something add before stop");
		v.stop();
		System.out.println("proxy : something add afetr stop");
	}

	@Override
	public void forword() {
		System.out.println("proxy : something add before forword");
		v.forword();
		System.out.println("proxy : something add afetr forword");
	}

	@Override
	public void reverse() {
		System.out.println("proxy : something add before reverse");
		v.reverse();
		System.out.println("proxy : something add afetr reverse");
	}

	@Override
	public void speed() {
		System.out.println("proxy : something add before speed");
		v.speed();
		System.out.println("proxy : something add afetr speed");
	}
}
