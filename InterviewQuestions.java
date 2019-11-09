package com.Class15;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InterviewQuestions {
public static void main(String[] args) {
System.out.println("Question 1");
	int a=10;
	int b=20;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
	
	String str1="Hello";
	String str2="Bye";
	str1=str1+str2;
	str2=str1.substring(0,5);
	str1=str1.substring(5);
	System.out.println(str1);
	System.out.println(str2);
System.out.println("Question 2");
//easy way
	int[] array= {100,-90,8787,898,0,1};
	Arrays.sort(array);
	int min=array[0];
	int max=array[array.length-1];
	int med=array[array.length-2];
	System.out.println(min);
	System.out.println(max);
	System.out.println(med);
//2nd way
	int[] myArray= {100,-90,8787,898,0,1};
	int largest=myArray[0];
	int smallest=myArray[0];
	int medium=myArray[0];
	for(int i=0;i<myArray.length;i++) {
		if(myArray[i]>largest) {
			largest=myArray[i];
		}
		if(myArray[i]<smallest) {
			smallest=myArray[i];
		}
	}
	System.out.println(smallest);
	System.out.println(largest);
System.out.println("Question 5");
	
//5
	String given="Welcome to the java class";
	String reversed="";
	String[] five=given.split("\\s");
	for (int i=five.length-1;i>=0;i--) {
		reversed =reversed+five[i]+" ";
		}
	System.out.println(reversed);
	System.out.println();
	//write a java program
	String aaa="Hello how are you";
	char [] ch=aaa.toCharArray();
	for(int i =ch.length-1;i>=0;i--) {
		System.out.print(ch[i]);
	}
	System.out.println("Using CharAt");
	String word3="I love Java";
		for(int i=word3.length()-1;i>=0;i--) {
			System.out.println(word3.charAt(i));
		}
	//6
	String a1="racecar";
	String a2="";
	for (int i=a1.length()-1; i>=0;i--) {
		a2=a2+a1.charAt(i);
	}
	System.out.println(a2);
	if (a2.contentEquals(a1)) {
		System.out.println("String is palindrome");
	}else {
		System.out.println("not palindrome");
	}
/////stack and heap memory
	//7
	int num=7;
	boolean isPrime=true;
	if (num==0 || num==1) {
		isPrime=false;
	}else {
	for(int i =2;i<num;i++) {
	if(num%i==0) {
	isPrime=false;
	break;
	}
	}
	if (isPrime) {
		System.out.println(num+" is a prime number");
	}else {
		System.out.println(num+" is not a prime number");
	}
	}
	//8
	int numf=0;
	int sum=0;
	for( int i=1;i<=21;i+=sum){
		sum=sum+i;
	}
	System.out.println(sum);
	int aa, bb, cc;
	aa=0;
	bb=1;
	for(int i=0; aa <=10;i++) {
		System.out.println(aa+" ");
		cc=aa+bb;
		aa=bb;
		bb=cc;
	}

	
}
}