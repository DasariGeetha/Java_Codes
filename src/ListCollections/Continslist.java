package ListCollections;

import java.util.ArrayList;

import java.util.List;

public class Continslist {
	
		public static void main(String[] args) {
		List ex=new ArrayList();
	    ex.add(10);
	    ex.add(20);
	    ex.add(30);
	    ex.add(40);
	    ex.add(40);
	    ex.add(50);
        boolean x=ex.contains(30);
	    System.out.println(x);
	    boolean y=ex.contains(200);
	    System.out.println(y);
		}

	}
