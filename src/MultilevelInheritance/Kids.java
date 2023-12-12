package MultilevelInheritance;

public class Kids extends Parents{
	
	public void Daughter1() {
		System.out.println("kid1: Geetha");
	}
	
	public void Daughter2() {
		System.out.println("kid2: Rajani");
}
		public static void main(String[] args) {
		
		Kids obj2 = new Kids();
		obj2.Daughter1();
		obj2.Daughter2();
		obj2.dad();
		obj2.mom();
		obj2.Gf1();
		obj2.Gm1();
		obj2.Gf2();
		obj2.Gm2();
	}

}