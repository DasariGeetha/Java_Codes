package SetCollections;

import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;

public class List2SetSizeCol {
	public static void main(String[] args) {
		List ex=new ArrayList();
		Set ex1=new TreeSet();
		    ex.add(10);
		    ex.add(20);
		    ex.add(30);
		    ex.add(40);
		    ex.add(50);
		    ex.add(10);
		    ex.add(200);
		    ex.add(300);
		    ex1.addAll(ex);
		    System.out.println(ex);
		    System.out.println(ex1);
		    int i= ex.size(); ex1.size();
		    System.out.println(i);	
	}
}
