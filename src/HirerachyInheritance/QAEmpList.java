package HirerachyInheritance;

public class QAEmpList extends Mainparent{
    public void emplist(){
    	System.out.println("Aarthy");
    	System.out.println("Swathy");
    	System.out.println("Charan");
    	System.out.println("Deepika");
    	System.out.println("Geetha");
    	System.out.println("Abarna");
    	System.out.println("Hari");
    }
    public static void main(String[] args) {
    	QAEmpList ref3=new QAEmpList();
    	ref3.login();
    	ref3.emplist();
    	
    }
     
}
