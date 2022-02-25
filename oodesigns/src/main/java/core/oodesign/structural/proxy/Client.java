package core.oodesign.structural.proxy;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("Without proxy");
		Vehicle car = new Car();
		System.out.println(car.getname());
		car.start();
		car.forword();
		car.speed();
		car.stop();
		
		
		
		System.out.println("with proxy");
		Vehicle proxy = new VehicleProxy(car);
		System.out.println(proxy.getname());
		proxy.start();
		proxy.forword();
		proxy.speed();
		proxy.stop();
	}

}
