package MapCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetcol {
	public static void main(String[] args) {
		Map ex=new HashMap();
		    ex.put(10, "a");
		    ex.put(20, "A");
		    ex.put(30, "1");
		    ex.put(40, "2");
		    ex.put(50, "AB");
		    ex.put(60, "a");
		    ex.put(70, "B");
		    Set s=ex.entrySet();
		    for (Object x : s) {
		    	System.out.println(x);	
			}
	    }
	}

