package com.neosoft;

public class WithDrawException extends Exception {

	private static final long serialVersionUID = 1L;
	
	String msg;
	public WithDrawException(String msg) {
		super(msg);
		this.msg=msg;
	}
	
	
	@Override
	public String toString() {
		return "WithDrawException "+ msg;
	}
	
	
	

}
