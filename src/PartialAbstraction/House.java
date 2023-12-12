package PartialAbstraction;

abstract class House {
	public abstract void Kitchen();
	
	public abstract void Livingroom();
	
	public static void Bedroom() {
		System.out.println("To sleep");
		
	}
	

}
//abstract means ;using abstract in class  ,object cant be created and  
//abstract using in method body cant be created using extends inherit the super class 