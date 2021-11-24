package com.oddpostion;

public class OddPostion {
	public static void main(String[] args) {
		int[]arr=new int[] {1,2,3,4,5};
		System.out.println("Enter of given array present on odd postion");
		for(int i=0;i<arr.length;i=i+2) {
			System.out.println(arr[i]);
		}
	}
	

}
