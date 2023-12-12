package HybridInheritance;

public class ClassB extends ClassA{
	public void men() { 
		System.out.println("Shirts" +";"+ "T-Shirts");
		System.out.println("Shoes");
	}
	public static void main(String[] args) {
		ClassB hyb1=new ClassB();
		hyb1.women();
        hyb1.men();
	}

}
