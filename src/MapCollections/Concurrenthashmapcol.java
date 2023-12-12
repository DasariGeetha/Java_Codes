package MapCollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;



public class Concurrenthashmapcol {
	public static void main(String[] args) {
		Map ex=new ConcurrentHashMap();
		    ex.put(10, "Java");
		    ex.put(20, "sql");
		    ex.put(30, ".net");
		    ex.put(40, "java");
		    ex.put(50, "testing");
		    ex.put(50, "selenium");
		    System.out.println(ex);
		    
	}

}
