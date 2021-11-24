package com.swappingnumbers;

import java.util.Scanner;

public class swappingNumbers {

	public static void main(String[] args) {
		int num1,num2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		num1 = scanner.nextInt();
		System.out.println("Enter the second number");
		num2 = scanner.nextInt();
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println("the first number after swappng" +num1);
		System.out.println("the second number after swapping" +num2);
		
		
		

	}

}
