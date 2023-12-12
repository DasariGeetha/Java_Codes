package PartialAbstraction;

public class Floor extends House{
	public void Kitchen() {
		System.out.println("To cook");
	}
	public void Livingroom() {
		System.out.println("Watch TV");
	}
	public static void main(String[] args) {
		Floor ref=new Floor();
		ref.Kitchen();
		ref.Livingroom();
		ref.Bedroom();
	}

}
