package com.shruthi.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {

	public static void ListStrings() {
		
		List<String> str = new ArrayList<String>();
		 str.add("ball"); 
	        str.add("arm");
	        str.add("ant");
	        str.add("alto");
	        List<Object> newstr ;
			newstr= str.stream().filter(s -> s.startsWith("a") && s.length()==3)
			.collect(Collectors.toList());
	        System.out.println(newstr);
		 
	}
}
