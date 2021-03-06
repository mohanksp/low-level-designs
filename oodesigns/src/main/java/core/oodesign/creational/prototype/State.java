package core.oodesign.creational.prototype;

public class State {
	private String name;
	private long population;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", population=" + population + "]";
	}


}
