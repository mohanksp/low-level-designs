package core.oodesign.structural.decorator;

public class Onion extends PizzaTopping {

	public Onion(IPizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String description() {
		return pizza.description()+" with Onion";
	}

	@Override
	public double cost() {
		return pizza.cost() + 1.0;
	}

}
