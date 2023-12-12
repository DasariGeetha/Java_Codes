package MapCollections;

import java.util.HashMap;
import java.util.Map;


public class Getmapcol {
	public static void main(String[] args) {
		Map ex=new HashMap();
		    ex.put(10, "Geetha");
		    ex.put(20, "geetha");
		    ex.put(30, "Geet");
		    ex.put(40, "geetha");
		    ex.put(50, "geetha");
		    Object s=ex.get(40);
		    System.out.println(s);
		
	}

}
