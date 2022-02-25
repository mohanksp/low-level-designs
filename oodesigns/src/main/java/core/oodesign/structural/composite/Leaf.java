package core.oodesign.structural.composite;

public class Leaf implements Component {

	private int price;
	private String name;
	
	public Leaf(String name, int price) {
		this.price = price;
		this.name = name;
	}
	
	@Override
	public int getPrice() {
		System.out.println(name+" :: "+price);
		return price;
	}

	@Override
	public String toString() {
		return "Leaf [name=" + name + "]";
	}
	
	

}
