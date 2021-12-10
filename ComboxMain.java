package com.technoelevate.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComboxMain {


		private static ArrayList<Combox1> ac = new ArrayList();
		public static void main(String[] args) {
			
Combox1 c1 = new Combox1("Rajesh",3,4,6);
Combox1 c2 = new Combox1("Kiran",8,9,2);
Combox1 c3 = new Combox1("Naveen",5,7,9);
Combox1 c4 = new Combox1("Sahu",2,7,3);
ac.add(c1);
ac.add(c2);
ac.add(c3);
ac.add(c4);
c1.getOwner();

MyComparator c = new MyComparator();
Collections.sort(ac,c);
for (Combox1 c5 : ac) {
	System.out.println(c5.getOwner() +" "+c5.getPens()+" "+c5.getPencils());

}
	}

}
