package Polyoverloading;

public class Numofargumts {
	public int sum(int x, int y) {
		return x+y;
		
	}
	public int sum(int x , int y, int z) {
		return x*y*z;
		
	}
	public double sum(double x ,double y) {
		return x-y;
	}
	public static void main(String[] args) {
		Numofargumts narg=new Numofargumts();
		System.out.println(narg.sum(2,3));
		System.out.println(narg.sum(10,20,30));
		System.out.println(narg.sum(8.9,7.6));
   }
}
// overloading have same method name but passes diff arguments..
//changing number of parameters