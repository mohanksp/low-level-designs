package core.oodesign.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Country implements Cloneable{

	private String name;
	private long population;
	private City city;
	private List<State> states = new ArrayList<>();

	public void add(State state){
		states.add(state);
	}
	
	public void remove(int index){
		states.remove(index);
	}
	
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

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}
	
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	
	@Override
	protected Country clone() throws CloneNotSupportedException {
		Country clon = (Country) super.clone();
		clon.setCity((City)clon.getCity().clone());
		List<State> stateList = new ArrayList<>();
		for(State state : this.getStates()) {
			stateList.add(state);
		}
		clon.setStates(stateList);
		return clon;
	}

	/*@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}*/

	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + ", city=" + city + ", states=" + states + "]";
	}

	
	
	

}
