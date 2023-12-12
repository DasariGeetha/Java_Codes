package Singleinheritance;

public class Kids extends Parent{
	public void daughter() {
		System.out.println("Name:Aishwarya");
	}
	public void son() {
		System.out.println("Name:Vihaan");
	}
	public static void main(String[] args) {
		Kids refer=new Kids();
		refer.daughter();
		refer.son();
		refer.Dad();
		refer.Mom();
	}

}
