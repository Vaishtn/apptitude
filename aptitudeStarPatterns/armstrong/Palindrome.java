package com.xworkz.aptitudeStarPatterns.armstrong;

public class Palindrome {
	public static void main(String args[]){  
		 int rev=0,rem,temp;
			int n=121;
			temp=n;
			while(n>10) {
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			if(temp==rev) 
				System.out.println("Palindrom");
			else
				System.out.println("not Palindrom");
		}

}
