package MapCollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Valuescol {
	public static void main(String[] args) {
		Map ex=new HashMap();
		    ex.put(10, "Geetha");
		    ex.put(20, "geetha");
		    ex.put(30, "Geeth");
		    ex.put(40, "geeth");
		    ex.put(50, "Geets");
		    ex.put(60, "Geetha");
		Collection s=ex.values();
		System.out.println(s);
		    
	}

}
