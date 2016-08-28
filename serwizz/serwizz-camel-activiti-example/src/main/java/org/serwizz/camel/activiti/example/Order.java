package org.serwizz.camel.activiti.example;

import java.io.Serializable;

public class Order implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String item;
	private String customerName;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Order [item=" + item + ", customerName=" + customerName + "]";
	}
	
	
}
