package HybridInheritance;

public class ClassC extends ClassA{
	public void Boykids() {
		System.out.println("Jeans"+ ";" +" Dhotis");
	}
	public static void main(String[] args) {
		ClassC hyb2=new ClassC();
		hyb2.women();
		hyb2.Boykids();
	}

}
