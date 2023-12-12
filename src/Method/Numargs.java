package Method;

public class Numargs {
	public void arg1(int a ,int b) {
		int c=a+b;
		System.out.println("arg1:" + "     " + c);
	}
	public void arg2(int x,int y) {
		int z=x*y;
		System.out.println("arg2:" + "     " + z);
	}
	public static void main(String[] args) {
		Numargs obj=new Numargs();
		obj.arg1(2, 3);
		obj.arg2(5, 4);
	}
}
