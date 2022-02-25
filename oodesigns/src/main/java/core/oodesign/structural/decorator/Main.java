package core.oodesign.structural.decorator;

public class Main {

	public static void main(String[] args) {
		IPizza pizza = new PanPizza();
		pizza = new Onion(pizza);
		pizza = new Cheese(pizza);
		pizza = new Tomatoes(pizza);
		System.out.println(pizza.description() + " :: " +pizza.cost());
	}

}
