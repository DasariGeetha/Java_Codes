package HirerachyInheritance;

public class Orgchild2 extends Mainparent {
  public void Contacts() {
	  System.out.println("dasari.geethasushma@gmail.com");
	  System.out.println("geethasushma@yopmail.com");
  }
  public static void main(String[] args) {
	  Orgchild2 ref2=new Orgchild2();
	  ref2.login();
	  ref2.Contacts();	 
  }
}
