package core.oodesign.creational.singletonFactory;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		AnimalFactory animalfactory = AnimalFactory.getInstance();
		Animal animalType = animalfactory.getAnimal("Dog");
		System.out.println(animalType.speak());
		
		AnimalFactory animalfactory1 = AnimalFactory.getInstance();
		Animal animalType1 = animalfactory1.getAnimal("Lion");
		System.out.println(animalType1.speak());
		
		AnimalFactory animalfactory2 = AnimalFactory.getInstance();
		Animal animalType2 = animalfactory2.getAnimal("duck");
		System.out.println(animalType2.speak());
		
		System.out.println(animalfactory.hashCode()+"---"+animalfactory1.hashCode()+"---"+animalfactory2.hashCode());

		/* It's throw clone not supported Exception
		 * AnimalFactory factory = (AnimalFactory) animalfactory.clone();
		 * factory.hashCode();
		 */

	}

}
