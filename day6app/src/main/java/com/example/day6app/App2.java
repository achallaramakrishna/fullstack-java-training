package com.example.day6app;

import java.util.HashMap;
import java.util.Map;

public class App2 {

	public static void main(String[] args) {
		
		Map<String,String> users = new HashMap<String,String>();
		
		users.put("rama", "rama1234");
		users.put("hari", "hari1234");
		users.put("ashok", "ashok1234");
		users.put("raman", "raman1234");
		
		String password = users.get("hari");
		System.out.println(password);
		
		System.out.println(users);

	}
	
	

}
