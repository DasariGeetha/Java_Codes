package String.in;

public class Strsplit {
   public static void main(String[] args) {
	   String s1="welcome to testing world";
	   System.out.println(s1.length());
	   String[] x=s1.split(" ");  //here we split by space
	   System.out.println(x.length);
	   String[] x1=s1.split("w");    //here we split by m
	   //System.out.println(s1.length());
	   System.out.println(x1.length);	   
   }
}
