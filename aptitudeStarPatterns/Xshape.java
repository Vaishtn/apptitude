package com.xworkz.aptitudeStarPatterns;

public class Xshape {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==j || i+j==n||i==0||i==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println();
			for(int k=0;k<=n;k++) {
				for(int j=0;j<=n;j++) {
					if((j>=k && k+j<=n) || (k+j>=n && j<=k))
						System.out.print("*");
					else
						System.out.print(" ");
				}
			
			System.out.println();
		}
	
	}

}
