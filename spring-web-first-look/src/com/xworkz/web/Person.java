package com.xworkz.web;

import java.util.ArrayList;
import java.util.List;

public class Person {

	List<String> list = new ArrayList<String>();

	public void addEmail(String email) {
		list.add(email);
	}
	
	
	public void search(String email)
	{
		list.contains(email);
	}

}
