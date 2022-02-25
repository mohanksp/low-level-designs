package core.oodesign.structural.decorator;

public class PanPizza implements IPizza {

	@Override
	public String description() {
		return "Pan Pizza";
	}

	@Override
	public double cost() {
		return 10.0;
	}

}
