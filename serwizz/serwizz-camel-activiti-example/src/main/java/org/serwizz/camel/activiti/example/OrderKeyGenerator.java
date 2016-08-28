package org.serwizz.camel.activiti.example;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderKeyGenerator {
	
	private static final Logger LOG = LoggerFactory.getLogger(OrderKeyGenerator.class);
	
	private AtomicLong orderId = new AtomicLong(0);
	
	public void service(Exchange exchange){
		LOG.debug("About to generate new order_id");
		
		exchange.setProperty("order_id", orderId.addAndGet(1));
		
		LOG.debug("Exchange set with order_id property...");
				
	}

}
