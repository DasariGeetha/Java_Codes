package HybridInheritance;

public class ClassD extends ClassC{
	public void Girlkids() {
		System.out.println("Lehengas"+ ";"+ "Frocks");
		}
	
	
	//public class ClassD extends ClassB {
		//public void Infants() {
		//System.out.println("Babywear dress");	
		//}
	//}
	public static void main(String[] args) {
		ClassD hyb3=new ClassD();
		hyb3.Boykids();
		hyb3.Girlkids();
		//hyb3.men();
	}
}
	