package com.technoelevate.mycollectioniteration2;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratingArrayListUsingIterator {

	
	private static ArrayList<SuperHeros> my = new ArrayList<SuperHeros>();
	public static void main(String[] args) {
		
		SuperHeros me = new SuperHeros("Surya from","India");
		SuperHeros me1 = new SuperHeros("Kranthi from","Download");
		SuperHeros me2= new SuperHeros("Tanzeer from","Land");
		SuperHeros me3= new SuperHeros("Rajesh from","Waterland");
		SuperHeros me4= new SuperHeros("Sandeep from","Erragadda");
		
		my.add(me);
		my.add(me1);
		my.add(me2);
		my.add(me3);
		my.add(me4);
		
		getSuperHeros();
		


	}
	private static void getSuperHeros() {

		Iterator itr = my.iterator();
		while(itr.hasNext()) {
			SuperHeros hero = (SuperHeros) itr.next();
			System.out.println(hero.getName()+" "+hero.getWeapon());
			}
		
	}

}
