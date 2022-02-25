package core.oodesign.structural.adapter;

public class NewCustomer implements ICustomer {

	private String cname;
	private Address adderess;
	private int age;
	private Order order;

	@Override
	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public Address getAdderess() {
		return adderess;
	}

	public void setAdderess(Address adderess) {
		this.adderess = adderess;
	}

	@Override
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "NewCustomer [cname=" + cname + ", adderess=" + adderess + ", age=" + age + ", order=" + order + "]";
	}

	
}
