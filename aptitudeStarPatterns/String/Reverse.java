package com.xworkz.aptitudeStarPatterns.String;

public class Reverse {
	public static void main(String[] args) {
		String op=Reverse.rev();
		System.out.println(op);
		
	}

	private static String rev() {
		String a="Xworkz";
		String b="";
		char[] array=a.toCharArray();
		for (int i = array.length-1; i >=0; i--) {
			b=b+array[i];
			
		}
		return b;
	}

	}


