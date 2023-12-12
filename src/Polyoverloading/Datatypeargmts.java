package Polyoverloading;

public class Datatypeargmts {
	static int dtype(int x, int y) {
		int z1 = x - y;
		return z1;
	}

	static double dtype(double a, double b) {
		double z2 = a + b;
		return z2;

	}

	public static void main(String[] args) {
		Datatypeargmts t = new Datatypeargmts();

		System.out.println("diff of two number:" + (t.dtype(11, 2)));
		System.out.println("Sum of two numbers:" + (t.dtype(6, 7)));
	}
}

//changing datatypes of the parameter
