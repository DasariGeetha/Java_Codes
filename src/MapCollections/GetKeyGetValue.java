package MapCollections;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Collections;



public class GetKeyGetValue {
	public static void main(String[] args) {
		Map ex=new HashMap();
		    ex.put(10, "A");
		    ex.put(20, "a");
		    ex.put(30, "ABC");
		    ex.put(40, "a");
		    ex.put(50, "def");
		    Set s=ex.entrySet();
		    for (Object x : s) {
		    	System.out.println((object.x).getkey());
		    	System.out.println(x.getvalue());
		    	
		    }		    	
	}

}
