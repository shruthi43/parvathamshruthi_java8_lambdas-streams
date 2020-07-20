package com.shruthi.java8;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageOfIntegers {
	public static void average(){
		   IntStream stream = IntStream.of(10,20,30,40,50); 
	       OptionalDouble obj1 = stream.average(); 
	       if (obj1.isPresent()) { 
	           System.out.println(obj1.getAsDouble()); 
	       }  
		}
}
