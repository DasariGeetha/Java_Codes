package Method;

public class Subargumts 
{
public void  arguments(String x)
{
 System.out.println(x);
}
public void arguments1(String y)
{
 System.out.println(y);
}
public void arguments2(String z)
{
 System.out.println(z);
}

public static void main(String args[])
{
Subargumts pass=new Subargumts();
pass.arguments("Balaji");
pass.arguments1("Geetha");
pass.arguments2("Aishu");
}
}