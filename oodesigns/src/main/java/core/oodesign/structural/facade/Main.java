package core.oodesign.structural.facade;

public class Main {

	public static void main(String[] args) {

		TravelPackageFacade travelPackageFacade = new TravelPackageFacadeImpl();
		travelPackageFacade.book();
	}

}
