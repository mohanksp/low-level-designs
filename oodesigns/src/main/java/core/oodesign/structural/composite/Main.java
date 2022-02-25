package core.oodesign.structural.composite;

public class Main {

	public static void main(String[] args) {

		//create leaf nodes
		Component ram = new Leaf("Ram", 500);
		Component hdd = new Leaf("HDD", 4000);
		Component mouse = new Leaf("Mouse", 400);
		Component keyborad = new Leaf("Keyboard", 800);
		Component moniter = new Leaf("Moniter", 9000);
		Component cpu = new Leaf("CPU", 5000);
		Component dvdWriter = new Leaf("DVDWriter", 1000);

		//create composite nodes
		Composite computer = new Composite("Computer");
		Composite cabinat = new Composite("Cabinat");
		Composite peripheral = new Composite("Peripheral");
		Composite mb = new Composite("Motherboard");
		
		//create tree structure
		computer.addComponent(cabinat);
		computer.addComponent(peripheral);
		
		peripheral.addComponent(mouse);
		peripheral.addComponent(keyborad);
		peripheral.addComponent(moniter);
		
		cabinat.addComponent(mb);
		cabinat.addComponent(dvdWriter);
		
		mb.addComponent(ram);
		mb.addComponent(hdd);
		mb.addComponent(cpu);
		
		System.out.println(computer);
		computer.getPrice();
	}

}
