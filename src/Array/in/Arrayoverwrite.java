package Array.in;

public class Arrayoverwrite {
	public static void main(String[] args) {
		int[] age=new int[4];
		age[0]=10;
		age[1]=20;
		age[2]=30;
		age[3]=40;
		age[1]=250;
		System.out.println("overwritten of 1:" + "" + age[1]);
		
	}

}
