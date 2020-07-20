package com.shruthi.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PalindromeList {
	public static void palindromescheck() {
        List<String> a = Arrays.asList("palindrome","epam","racecar","madam","task","noon");
        List<String> palindromes = PalindromeList.findPalindrome(a, 
                (str) -> PalindromeList.isPalindrome((String) str));
 
        System.out.println(palindromes);
    }
 
    public static boolean isPalindrome(String str) {
    	StringBuffer newStr =new StringBuffer();
    	for(int j = str.length()-1; j >= 0 ; j--) {
    	newStr = newStr.append(str.charAt(j));
    	}
    	if(str.equalsIgnoreCase(newStr.toString())) {
    		return true;
    	} else {
    		return false;
    	}
        } 
    public static List<String> findPalindrome(List<String> list, Predicate<String> predicate) { 
    	List<String> pal = new ArrayList<String>(); 
    	list
    	.stream()
    	.filter((i) -> (predicate.test((String) i))).forEach((i) -> {
            pal.add((String) i);
        });
        return pal;
    }  
}
