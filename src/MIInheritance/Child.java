package MIInheritance;

public class Child implements Parent2 {

	public void mom() {
		System.out.println("Mummy");

	}

	public void dad() {
		System.out.println("Daddy");

	}

	public void girlkid() {
        System.out.println("Girlbaby");
    }

	public static void main(String[] args) {
		Child obj = new Child();
		obj.mom();
		obj.dad();
		obj.girlkid();

	}

}

// Compilation error throws as its priority problem using abstarct it works
