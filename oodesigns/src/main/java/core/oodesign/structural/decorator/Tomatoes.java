package core.oodesign.structural.decorator;

public class Tomatoes extends PizzaTopping {

	public Tomatoes(IPizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String description() {
		return pizza.description()+" with Tomatoes";
	}

	@Override
	public double cost() {
		return pizza.cost() + 1.5;
	}
}
