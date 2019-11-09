package com.Class15;
public class StringMethods {
public static void main(String[] args) {
	//replace
	String str="Java classes at Syntax are awesome";
	str=str.replace("awesome", "great");
	System.out.println(str);
	str=str.replace("a", "1234  68%&&  %%%");
	System.out.println(str);
	//replace all=specify regular expressions
	//lets remove all special characters
	str=str.replaceAll("[^A-Za-z0-9]","");
	System.out.println(str);
	//split
	String myString="Java classes at Syntax are awesome";
	String [] array=myString.split("a");
	System.out.println(myString);
	System.out.println(array.length);
}
}