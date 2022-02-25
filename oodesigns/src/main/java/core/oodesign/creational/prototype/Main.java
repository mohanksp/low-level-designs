package core.oodesign.creational.prototype;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Country original = new Country();
		original.setName("India");
		original.setPopulation(100000000);
		City city = new City();
		city.setName("Ghaziabad");
		
		original.setCity(city);
		
		State state1 = new State();
		state1.setName("UP");
		state1.setPopulation(100000);

		State state2 = new State();
		state2.setName("Bihar");
		state2.setPopulation(200000);
		
		State state3 = new State();
		state3.setName("MP");
		state3.setPopulation(300000);
		
		State state4 = new State();
		state4.setName("UK");
		state4.setPopulation(400000);
		
		State state5 = new State();
		state5.setName("HR");
		state5.setPopulation(500000);
		
		State state6 = new State();
		state6.setName("Delhi");
		state6.setPopulation(600000);
		
		original.add(state1);
		original.add(state2);
		original.add(state3);
		original.add(state4);
		original.add(state5);
		original.add(state6);

		Country clone = original.clone();
		
		original.remove(3);
		//original.remove(4);
		original.getCity().setName("Mumbai");

		System.out.println("original :: "+original);
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("cloned :: "+clone);
		
		
	}

}
