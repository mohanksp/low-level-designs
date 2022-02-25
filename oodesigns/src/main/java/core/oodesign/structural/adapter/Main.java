package core.oodesign.structural.adapter;

public class Main {

	public static void main(String[] args) {

		OldCustomer old = new OldCustomer();
		old.setCname("Monk");
		old.setAge(25);
		old.setOrderAmount(1000);
		old.setAdderess("E-1701, Jaipuriya Indirapuram, Ghaziabad");
		
		NewCustomer adapter = new CustomerAdapter(old);
		System.out.println(adapter);
	}

}
