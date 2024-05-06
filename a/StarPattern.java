package com.a;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=4; j++) {
				if(i==1|| j==1 ||i==3||j==4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------");
		
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=4; j++) {
				if(i==1||j==1||i==3||(i==2 && j>3)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			System.out.println("------------------------------------------------------------");

		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(j==1||j==5||i==j) {
					System.out.print("*");
				}
				else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------");

		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if(j==1||j==5||(i==2&&j==2)||(i==2&&j==4)||(i==3&&j==3)) {
					System.out.print("*");
				}
				else {
					System.out.print("-");
				}
			}
			System.out.println();
			}
		}
	}


