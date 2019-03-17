package com.xworkz.web.dto;

import java.io.Serializable;

public class MessageDTO implements Serializable{
	
	private String message;
	private int noOfChars;
	
	public MessageDTO() {
		System.out.println("created............"+this.getClass().getSimpleName());
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getNoOfChars() {
		return noOfChars;
	}

	public void setNoOfChars(int noOfChars) {
		this.noOfChars = noOfChars;
	}

	@Override
	public String toString() {
		return "MessageDTO [message=" + message + ", noOfChars=" + noOfChars + "]";
	}
	
	

}
