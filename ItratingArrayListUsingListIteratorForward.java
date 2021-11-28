package com.technoelevate.mycollectioniteration4;

import java.util.ArrayList;
import java.util.ListIterator;

public class ItratingArrayListUsingListIteratorForward {
	
	private static ArrayList<SuperHeros> a1 = new ArrayList<SuperHeros>();
	private static ArrayList<SuperHeros> al;

	public static void main(String[] args) {
		SuperHeros hr =new SuperHeros("Ben10","Watch");
		SuperHeros hr1=new SuperHeros("Spiderman","web");
		SuperHeros hr2=new SuperHeros("torjan","stone");
		SuperHeros hr3=new SuperHeros("Developer","computer");
		SuperHeros hr4=new SuperHeros("Batman","belt");
		
		
		al.add(hr);
		al.add(hr1);
		al.add(hr2);
		al.add(hr3);
		al.add(hr4);
		getSuperHeros();


	}

	private static void getSuperHeros() {
		ListIterator itr = al.listIterator();
		while(itr.hasNext()) {
			SuperHeros hero = (SuperHeros) itr.next();
			System.out.println(hero.getName()+"uses"+hero.getWeapon());
		}
		
	}

}
