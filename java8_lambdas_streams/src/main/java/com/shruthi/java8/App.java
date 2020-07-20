package com.shruthi.java8;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.print("Average of list of integers : ");
        AverageOfIntegers.average();
        System.out.print("List of strings which begin with the  letter 'a' and have exactly 3 letters are : ");
        StringFilter.ListStrings();
        System.out.print("List of all palindromic strings : ");
        PalindromeList.palindromescheck();
    }
}
