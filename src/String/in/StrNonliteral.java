package String.in;

public class StrNonliteral {
	public static void main(String[] args) {
		String s1="Vihaan Srisai";
		String s2="Vihaan Srisai";
		System.out.println(System.identityHashCode(s1));   //literal string share memeory if its same name 
		System.out.println(System.identityHashCode(s2));
		String s3=new String("Vihaan Srisai");
		String s4=new String("Vihaan Srisai");
		System.out.println(System.identityHashCode(s3));    //non literal create wont share even if its same name as its substring
		System.out.println(System.identityHashCode(s4));
	}

}
