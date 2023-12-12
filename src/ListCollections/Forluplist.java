package ListCollections;

import java.util.ArrayList;
import java.util.List;

public class Forluplist {
	public static void main(String[] args) {
		List ex=new ArrayList();
		     ex.add(10);
		     ex.add(20);
		     ex.add(30);
		     ex.add(40);
		     ex.add(40);
		     ex.add(50);
		     for(int i=0;i<ex.size();i++) {
		     System.out.println(ex.get(i));
		    }
	}

}
