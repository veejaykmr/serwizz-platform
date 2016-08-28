package org.serwizz.camel.activiti.example;


import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangeProperty;
import org.apache.camel.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResponseOrderBean {

	private static Logger LOG = LoggerFactory.getLogger(ResponseOrderBean.class);
	
	@Handler
	public OrderResponse respondToOrderRequest(@ExchangeProperty("order") Order order,@ExchangeProperty("order_id") String orderId){
		
		LOG.info("Respond To Order Request : Order {}, with id {}",order,orderId);
		
		
		OrderResponse response = new OrderResponse();
		response.setOrder(order);
		response.setOrderId(orderId);
		return response;
	}
}
