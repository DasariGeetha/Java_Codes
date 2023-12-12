package Polyoverloading;

public class OrderofParamter {
	public void list(String name, int roll_no,double marks) {
		System.out.println("Name:" + name + "; " + "roll_no:" + roll_no + "; " + "marks" + marks);
	}
	public void list( int roll_no,double marks,String name) {
		System.out.println("roll_no:" + roll_no + ";" + "marks" + marks +";" +"Name:" + name);
    }
	public static void main(String[] args) {
		OrderofParamter order=new OrderofParamter();
		order.list("geetha", 9, 21.3);
		order.list(4, 23.4, "Rajani");
		
	}
}
//order of parameters can be reversed
//can create another cass to call the methods in main method declaration or else can be done in this way