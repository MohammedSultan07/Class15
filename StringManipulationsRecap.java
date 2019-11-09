package com.Class15;
public class StringManipulationsRecap {
public static void main(String[] args) {
	
	String  str="Hello";
	String str1= new String("hello");
	System.out.println(str);
	System.out.println(str1);
	//find number of string length
	int length=str.length();
	System.out.println(length);
	//case conversion
	str=str.toLowerCase().toUpperCase();
	System.out.println(str);
	//verify if String is empty
	String myString="";
	System.out.println(myString.isEmpty());//true
	String myString1=null;
	//System.out.println(myString1.isEmpty());//error because there is no value
	//how to verify existence of characters in the String
	String a="Good evening students";
	System.out.println(a.contains("student"));
	System.out.println(a.startsWith("Go"));
	System.out.println(a.endsWith("nts"));
	//charAt();
	String str2="Syntax Technologies";
	char letter=str2.charAt(5);
	System.out.println(letter);
	System.out.println(str2.charAt(str2.length()-1));
	//substring from a String
	System.out.println(str2.substring(0, 6));
	String substr2=str2.substring(0, 6);
	System.out.println(substr2);
}
}