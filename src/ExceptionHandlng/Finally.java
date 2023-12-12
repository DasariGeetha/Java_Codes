package ExceptionHandlng;

public class Finally {
	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		try {
			System.out.println(10/0);
		    }
			catch(ArithmeticException c) {
			 System.out.println("done/by Zero");
			}
	 finally{
			  System.out.println("Finally");
			}
		System.out.println("4");
		System.out.println("5");
		System.out.println("end");
		}

}

}
