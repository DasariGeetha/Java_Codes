package UncheckedException;

import java.util.ArrayList;
import java.util.List;

public class IndexoutofboundExcep {
	public static void main(String[] args) {
		List ex=new ArrayList();
		     ex.add(10);
		     ex.add(20);
		     ex.add(30);
		     ex.add(40);
		     ex.add(50);
		System.out.println(ex.get(3));
		System.out.println(ex.get(10));
		     
		
	}

}
