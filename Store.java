package com.technoelevate.groceryshopping;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
ArrayList<GroceryShoppingCart> arr = new ArrayList<GroceryShoppingCart>();

 
   
   Scanner sc = new Scanner(System.in);
   System.out.println("choose the Number to get into it");
   
   System.out.println("choose 1 for add the items");
   
   System.out.println("choose 2 to view items");
   
   System.out.println("choose 3 for remove the items");
   
   System.out.println("choose 4 for search the items");
   
   int choice = sc.nextInt();
 
   switch(choice) {
   case 1:
			  GroceryShoppingCart.add();
			  GroceryShoppingCart.menu();
			  break;
   case 2:
		  GroceryShoppingCart.view();
		  GroceryShoppingCart.menu();
		  break;
   case 3:
		  GroceryShoppingCart.remove();
		  GroceryShoppingCart.menu();
		  break;
   case 4:
		  GroceryShoppingCart.replaceMyItems();
		  GroceryShoppingCart.menu();
		  break;
   }
   

	}

 }
