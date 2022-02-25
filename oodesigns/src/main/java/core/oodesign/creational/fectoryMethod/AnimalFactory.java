package core.oodesign.creational.fectoryMethod;
public class AnimalFactory {

	public Animal getAnimal(String animalType) {
		Animal animal = null;
		if ("dog".equalsIgnoreCase(animalType)) {
			animal = new Dog();
		} else if ("duck".equalsIgnoreCase(animalType)) {
			animal = new Duck();
		} else if ("lion".equalsIgnoreCase(animalType)) {
			animal = new Lion();
		}
		return animal;
	}

}
