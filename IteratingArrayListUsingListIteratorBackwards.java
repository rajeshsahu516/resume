package com.technoelevate.mycollectioniteration3;

import java.util.ArrayList;
import java.util.ListIterator;

public class IteratingArrayListUsingListIteratorBackwards {
private static ArrayList list=new ArrayList();
	public static void main(String[] args) {
		SuperHeros s1 = new SuperHeros("Donald","kphb");
		SuperHeros s2 = new SuperHeros("Rajesh","Palasa");
		SuperHeros s3 = new SuperHeros("Ravi","Haripuram");
		SuperHeros s4 = new SuperHeros("Sunil","Bethalapuram");
		SuperHeros s5 = new SuperHeros("Pavan","Vizag");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		getSuperHeros();


	}
	private static void getSuperHeros() {
ListIterator itr = list.listIterator(list.size());
while(itr.hasPrevious()) {
	SuperHeros hero = (SuperHeros) itr.previous();
	System.out.println(hero.getName()+"stays at"+hero.getWeapon());
}

		
	}

}
