package Fullabstrct;

public class Pega implements Replatform {
public void Account() {
		System.out.println("CustomerNum:CUS12345");
}
public void Door() {
		System.out.println("Door id:org 789");
}
public void Contact() {
		System.out.println("New name:mail id");
}
public void ReatilerOnboarding() {
		System.out.println("Sync service now:No");
}
public void RetailerAgreement() {
		System.out.println("Contract:docusign");
}
public void Tax() {
		System.out.println("Audit:postive");
}

public void DigitalHealthcheck() {
		System.out.println("Reviews:Good");
}
public void state() {
		System.out.println("UnitedStates:Virginia");
}
public static void main(String[] args) {
	Pega obj=new Pega();
	obj.Account();
    obj.Contact();
    obj.Door();
    obj.state();
}
}
//non abstract doesnt support ,need to declare in subclass by creating method and obj creation