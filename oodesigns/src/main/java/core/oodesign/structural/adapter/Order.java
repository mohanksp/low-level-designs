package core.oodesign.structural.adapter;

import java.util.Date;

public class Order {

	private Date orderDate;
	private float amount;
	private String itemName;

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Order [orderDate=" + orderDate + ", amount=" + amount + ", itemName=" + itemName + "]";
	}
	

}
