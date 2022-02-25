package core.oodesign.creational.builder;

public class McDonaldsOrder {

	private String burger;
	private String coke;
	private String pocket;
	private String macpuff;
	private String frenchFry;
	private String coffi;

	public McDonaldsOrder(String burger, String cock, String pocket, String macpuff, String frenchFry, String coffi) {
		super();
		this.burger = burger;
		this.coke = cock;
		this.pocket = pocket;
		this.macpuff = macpuff;
		this.frenchFry = frenchFry;
		this.coffi = coffi;
	}

	public String getBurger() {
		return burger;
	}

	public void setBurger(String burger) {
		this.burger = burger;
	}

	public String getCoke() {
		return coke;
	}

	public void setCoke(String coke) {
		this.coke = coke;
	}

	public String getPocket() {
		return pocket;
	}

	public void setPocket(String pocket) {
		this.pocket = pocket;
	}

	public String getMacpuff() {
		return macpuff;
	}

	public void setMacpuff(String macpuff) {
		this.macpuff = macpuff;
	}

	public String getFrenchFry() {
		return frenchFry;
	}

	public void setFrenchFry(String frenchFry) {
		this.frenchFry = frenchFry;
	}

	public String getCoffi() {
		return coffi;
	}

	public void setCoffi(String coffi) {
		this.coffi = coffi;
	}

	@Override
	public String toString() {
		return "McDonaldsOrder [burger=" + burger + ", cock=" + coke + ", pocket=" + pocket + ", macpuff=" + macpuff
				+ ", frenchFry=" + frenchFry + ", coffi=" + coffi + "]";
	}

	
}
