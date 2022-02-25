package core.oodesign.creational.singletonFactory;

public class AnimalFactory {

	private static AnimalFactory INSTANCE;

	static {
		init(); // 
	}

	private static void init() {
		INSTANCE = new AnimalFactory();
		System.out.println(INSTANCE.hashCode());
	}

	private AnimalFactory() {
		System.out.println("constractor");
	}

	public static AnimalFactory getInstance() {
		return INSTANCE;
	}

	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

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
