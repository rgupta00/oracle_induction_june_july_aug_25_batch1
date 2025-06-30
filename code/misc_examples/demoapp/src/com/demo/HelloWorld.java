package com.demo;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		int val = getInputFromUser();
		
		printStar(val);
	}



	private static void printStar(int val) {
		for(int i=0;i<val;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
	
	private static int getInputFromUser() {
		System.out.println("PE a no");
		Scanner scanner=new Scanner(System.in);
		int val=scanner.nextInt();
		return val;
	}

}
