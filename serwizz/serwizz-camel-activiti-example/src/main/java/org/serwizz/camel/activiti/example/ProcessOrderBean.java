package org.serwizz.camel.activiti.example;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Body;
import org.apache.camel.Handler;
import org.apache.camel.language.Simple;

public class ProcessOrderBean {

	@Handler
	public Map processOrder(@Body Order order,@Simple("${date:now:yyyy-MM-dd kk:mm:ss}") String timestamp){
        Map<String, Object> variables = new HashMap<String, Object>();
        variables.put("order", order);
        variables.put("order_id", 1);
        variables.put("timestamp", timestamp);
        return variables;
		
	}
}
