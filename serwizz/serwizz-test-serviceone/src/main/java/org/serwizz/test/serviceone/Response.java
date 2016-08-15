package org.serwizz.test.serviceone;

public class Response {
	
	private String type;
	private String status;
	private String message;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Response [type=" + type + ", status=" + status + ", message=" + message + "]";
	}
	
	

}
