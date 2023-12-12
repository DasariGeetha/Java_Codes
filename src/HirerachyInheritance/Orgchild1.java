package HirerachyInheritance;

public class Orgchild1 extends Mainparent {
	public void Orgname() {
		System.out.println("Customer Analytics");
	}
	public void Accounts() {
		System.out.println("CUS12345");
	}
	public void Doors() {
		System.out.println("9876");
	}
	public static void main(String[] args) {
		Orgchild1 ref1=new Orgchild1();
		ref1.login();
		ref1.Orgname();
		ref1.Accounts();
		ref1.Doors();
		
	}

}
