package core.entity;

import lombok.Data;


public class Core{
	
	private	boolean successful;
	private String message;
	
	public Core() {
	}
	
	public boolean isSuccessful() {
		return successful;
	}
	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}