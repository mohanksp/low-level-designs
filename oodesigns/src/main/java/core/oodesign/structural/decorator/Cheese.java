package core.oodesign.structural.decorator;

public class Cheese extends PizzaTopping {

	public Cheese(IPizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String description() {
		return pizza.description()+" with Cheese";
	}

	@Override
	public double cost() {
		return pizza.cost() + 2.5;
	}

}
