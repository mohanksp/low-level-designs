package core.oodesign.creational.fectoryMethod;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		AnimalFactory animalfactory = new AnimalFactory();
		Animal animalType = animalfactory.getAnimal("Dog");
		System.out.println(animalType.speak());
		
		AnimalFactory animalfactory1 = new AnimalFactory();
		Animal animalType1 = animalfactory1.getAnimal("Lion");
		System.out.println(animalType1.speak());
		
		AnimalFactory animalfactory2 = new AnimalFactory();
		Animal animalType2 = animalfactory2.getAnimal("duck");
		System.out.println(animalType2.speak());
	}

}
