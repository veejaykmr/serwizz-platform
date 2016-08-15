package org.serwizz.test.serviceone;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceOne {

	private static final Logger LOG = LoggerFactory.getLogger(ServiceOne.class);
	
	public void service(Exchange exchange){
		Map headers = exchange.getIn().getHeaders();
		Object bodyObj = exchange.getIn().getBody();
		//HashMap map = exchange.getIn().getBody(HashMap.class);
		//LOG.debug("About to service exchange map {}",map);
		
		LOG.debug("Headers : {}",headers);
		//LOG.debug("Body : {}",map);
		LOG.debug("Body : {}",bodyObj);
		
		Response response = new Response();
		response.setStatus("SUCCESS");
		response.setType("json");
		response.setMessage("Hello There from ServiceOne...");
		
		LOG.debug("About to response with {}",response);
		
		exchange.getOut().setBody(response);
		
		LOG.debug("About to exit service exchange...");
	}
}
