package com.javasimpleinterest;

import java.util.Scanner;

public class JavaSimpleInterest {

	public static void main(String[] args) {
		float p,r,t,sinterest;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principle");
		p =scan.nextFloat();
		System.out.println("Enter the rate of interest");
		r =scan.nextFloat();
		System.out.println("enter the time period");
		t =scan.nextFloat();
		scan.close();
		sinterest = (p * r * t) / 100;
		System.out.println("Simple Interest is: " +sinterest);
	}

}
