package core.oodesign.creational.builder;

public class Main {

	public static void main(String[] args) {

		McDonaldsOrder mcDonaldsOrder = new McdonaldOrderBuilder()
											.setBurger("chicken")
											.setCoke("cocacola")
											.setFrenchFry("plan fries")
											.setCoffi("cold coffi")
											.build();
		
		System.out.println(mcDonaldsOrder);
		
	}

}
