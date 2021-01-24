package com.xworkz.aptitudeStarPatterns.String;

public class ReplaceMsg {

	public static void main(String[] args) {
		String msg=msg(" hi name welcome to string execution");
		System.out.println("before replacing name"+msg);
	}
	public static String msg(String name) {
		String name1=name.replace("name", "vai");
		//System.out.println("replace name is "+name1);
		return name1;
		
	}

}
