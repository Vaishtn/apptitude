package com.xworkz.aptitudeStarPatterns.String;

public class CharArray {
public static void main(String[] args) {
	char[] msg=name("vai");
	for(int i=0;i<msg.length;i++) {
		System.out.println("char at"+i+"index is"+msg[i]);
	}
	
	//System.out.println(msg);
	
}
public static char[] name(String name) {
	char[] name1=name.toCharArray();
	return name1;
	
}
	
}
