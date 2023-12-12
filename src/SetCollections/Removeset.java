package SetCollections;

import java.util.Set;
import java.util.TreeSet;

public class Removeset {
public static void main(String[] args) {
	Set ex=new TreeSet();
	    ex.add(10);
	    ex.add(20);
	    ex.add(30);
	    ex.add(10);
	    ex.add(40);
	    ex.add(50);
	    ex.add(40);
	    ex.remove(10);
	    System.out.println(ex);
	    
}
}
