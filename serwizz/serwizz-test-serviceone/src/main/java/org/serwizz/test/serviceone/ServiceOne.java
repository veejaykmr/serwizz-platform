package org.serwizz.test.serviceone;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceOne {

	private static final Logger LOG = LoggerFactory.getLogger(ServiceOne.class);
	
	public void service(Exchange exchange){
		LOG.debug("About to service exchange {}",exchange.getIn().getBody(String.class));
		
		exchange.getOut().setBody("Hello from ServiceOne");
		
		LOG.debug("About to exit service exchange...");
	}
}
