package com.technoelevate.linkedlistintoarray;

import java.util.LinkedList;

public class LinkedListIntoArray {

	public static void main(String[] args) {
LinkedList<String>languages=new LinkedList<String>();
languages.add("Java");
languages.add("Python");
languages.add("JavaScript");
System.out.println("LinkedList: " + languages);
String[] arr = new String[languages.size()];
languages.toArray(arr);
System.out.println("Array:");
for(String item:arr) {
	System.out.println(item+",");
}


	}

}
