package com.a;
import java.util.Scanner;

public class Float {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a float value: ");
	        float floatValue = scanner.nextFloat();

	        
	        System.out.printf("Value with two decimal places: %.2f\n", floatValue);
	        System.out.println("Value with two decimal places: %.2f\n"+ floatValue);

	    }
	}


