package MultilevelInheritance;

public class Gkids extends Slaw{
	public void Gd() {
		System.out.println("Grand Daughter: Aishwarya");
	}
	public void Gs() {
		System.out.println("Grand son:Vihaan SriSai");
	}
	public static void main(String[] args) {
		Gkids obj4=new Gkids();
		obj4.Gd();
		obj4.Gs();
		obj4.soninlaw1();
		obj4.soninlaw2();
		obj4.Daughter1();
		obj4.Daughter2();
		obj4.dad();
		obj4.mom();
		obj4.Gf1();
		obj4.Gm1();
		obj4.Gf2();
		obj4.Gm2();
		
	}

}

