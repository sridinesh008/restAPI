package com.jersey.friends.controller;

import java.util.HashMap;




public class simpleTest {

	
	public static void test(){
		HashMap<String, String> something=  new HashMap<String, String>();
	    something.put("1", "1");
	    something.put("2", "22");
	    something.put("3", "33");
	    something.put("4", "4444");
	    something.remove("1");
	    System.out.println(something);
	}
	public static void main(String[] args) {
	simpleTest test=new simpleTest();
	test();
		
	}

}
