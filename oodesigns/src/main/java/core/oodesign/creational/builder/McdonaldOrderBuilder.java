package core.oodesign.creational.builder;

public class McdonaldOrderBuilder {

	private String burger;
	private String coke;
	private String pocket;
	private String macpuff;
	private String frenchFry;
	private String coffi;
	private McDonaldsOrder mcDonaldsOrder = null;

	public McdonaldOrderBuilder setBurger(String burger) {
		this.burger = burger;
		return this;
	}

	public McdonaldOrderBuilder setCoke(String coke) {
		this.coke = coke;
		return this;
	}

	public McdonaldOrderBuilder setPocket(String pocket) {
		this.pocket = pocket;
		return this;
	}

	public McdonaldOrderBuilder setMacpuff(String macpuff) {
		this.macpuff= macpuff;
		return this;
	}

	public McdonaldOrderBuilder setFrenchFry(String frenchFry) {
		this.frenchFry = frenchFry;
		return this;
	}
	
	public McdonaldOrderBuilder setCoffi(String coffi) {
		this.coffi = coffi;
		return this;
	}

	public McDonaldsOrder build(){
		mcDonaldsOrder = new McDonaldsOrder(burger, coke, pocket, macpuff, frenchFry, coffi);
		return mcDonaldsOrder;
	}
}
