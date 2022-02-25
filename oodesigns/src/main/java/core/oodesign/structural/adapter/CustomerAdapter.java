package core.oodesign.structural.adapter;

public class CustomerAdapter extends NewCustomer implements ICustomer{
	
	private OldCustomer oldCustomer;
	
	public CustomerAdapter(OldCustomer oldCustomer) {
		this.oldCustomer = oldCustomer;
		adapData();
	}
	
	
	private void adapData(){
		setCname(oldCustomer.getCname());
		setAge(oldCustomer.getAge());
		
		String adress[] = oldCustomer.getAdderess().split(",");
		
		Address address = new Address();
		address.setHno(adress[0]);
		address.setLandmark(adress[1]);
		address.setCity(adress[2]);
		address.setCountry("India");
		
		setAdderess(address);
		
		Order order = new Order();
		order.setAmount(oldCustomer.getOrderAmount());
		setOrder(order);
	}
	
	public NewCustomer getNewCustomer(){
		return this;
	}
	
}
