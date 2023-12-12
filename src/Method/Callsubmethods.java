package Method;

public class Callsubmethods {
	public void add() {
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println("Sum =" + c);
	}
    public void sub() {
    	int d=10;
    	int e=5;
    	int f=d-e;
    	System.out.println("Sub =" + f);
    	
    }
    public void mul() {
    	int m=5;
    	int n=5;
    	int l=m*n;
    	System.out.println("mul =" + l);
    }
	public static void main(String args[]) {
		Callsubmethods X = new Callsubmethods();
        X.add();
        X.sub();
        X.mul();
	}
}
