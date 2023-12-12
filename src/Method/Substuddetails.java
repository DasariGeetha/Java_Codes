package Method;

public class Substuddetails {
	
	public void StudentName(){
	
		System.out.println("Name:Geetha");
	}
    public void Studentrollno(){
    	System.out.println("Roll No:11");
    }
    public void Studentdepartment(){
    	System.out.println("Department:CSE");
    }
    public void Studentaddress(){
    	System.out.println("Address-A2B gerugambakkam");
    }
    public void Pincode() {
        System.out.println("enter pincode pincode:600122");
    }
    	public static void main(String[] args)
        {
    		Substuddetails Info=new Substuddetails();
        	Info.Pincode();
        	Info.StudentName();
            Info.Studentrollno();
            Info.Studentaddress();
            Info.Studentdepartment();
            
        }
    }	
   
  
