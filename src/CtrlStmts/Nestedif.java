package CtrlStmts;

public class Nestedif {
	public static void main(String[] args) {
		int age = 37;
		int weight = 55;
		double height = 5.5;
		if (age >= 48 && weight >= 60 && height >= 6) {
//			if (weight >= 50) {
//				if (height >= 6) {
			System.out.println("you are eligible");
		} else
			System.out.println("not matching");
	}
//		}
//	}
}
