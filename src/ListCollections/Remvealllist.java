package ListCollections;

import java.util.ArrayList;

import java.util.List;

public class Remvealllist {
	public static void main(String[] args) {
		List ex=new ArrayList();
		List ex1=new ArrayList();
		     ex.add(10);
		     ex.add(20);
		     ex.add(30);
		     ex.add(40);
		     ex.add(40);
		     ex.add(50);
		     ex.add(60);
		     ex.remove(4);
		     System.out.println(ex);
		     ex1.addAll(ex);
		     ex.add(100);
		     ex.add(20);
		     ex.add(200);
		     ex.add(300);
		     ex1.add(4000);
		     ex1.add(5000);
		     ex1.add(6000);
		     System.out.println(ex);
		     ex1.removeAll(ex);
		     System.out.println(ex1);
		     
	}



}
