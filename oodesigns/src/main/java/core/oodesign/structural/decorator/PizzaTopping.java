package core.oodesign.structural.decorator;

public class PizzaTopping implements IPizza {

	public IPizza pizza;
	
	@Override
	public String description() {
		return null;
	}

	@Override
	public double cost() {
		return 0;
	}

}
