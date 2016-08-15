package org.serwizz.test.serviceone;

import java.util.Map;

public class Request {
	
	private Map header;
	
	private String type;

	public Map getHeader() {
		return header;
	}

	public void setHeader(Map header) {
		this.header = header;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Request [header=" + header + ", type=" + type + "]";
	}
	
	
}
