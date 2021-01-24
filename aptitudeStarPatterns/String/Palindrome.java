package com.xworkz.aptitudeStarPatterns.String;

public class Palindrome {
	public static void main(String[] args) {
		String op=Palindrome.rev();
		System.out.println(op);
	}
	public static String rev() {
		String a="GadaG";
		String b="";
		char[] array=a.toCharArray();
		for (int  i = array.length-1;i>=0; i--) {
			b=b+array[i];
			
		}
		if(b.equals(a)) {
			return "String is palindrome";
		}else {
			return "String is not palindrome";
		}
		
	}
	
	}
