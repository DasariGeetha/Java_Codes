package MapCollections;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class Keysetcol {
	public static void main(String[] args) {
		Map ex=new HashMap();
		    ex.put(10,"ABC");
		    ex.put(20,"abc");
		    ex.put(30,"123");
		    ex.put(40,"ABC");
		    ex.put(50,"ABC");
		    ex.put(20,"DeF");
		Set s=ex.keySet();
		System.out.println(s);
		
		    
		
	}

}
