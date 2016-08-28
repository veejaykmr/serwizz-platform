package org.serwizz.camel.activiti.example;

import java.io.Serializable;

public class OrderResponse implements Serializable{

	private static final long serialVersionUID = 2L;
	
	private Order order;
	private String orderId;
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "OrderResponse [order=" + order + ", orderId=" + orderId + "]";
	}
	
	
}
